package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.config.COSConfig;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.po.Tbshare;
import com.po.Tbuser;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.exception.CosClientException;
import com.qcloud.cos.exception.CosServiceException;
import com.qcloud.cos.exception.MultiObjectDeleteException;
import com.qcloud.cos.exception.MultiObjectDeleteException.DeleteError;
import com.qcloud.cos.model.DeleteObjectsRequest;
import com.qcloud.cos.model.DeleteObjectsRequest.KeyVersion;
import com.qcloud.cos.model.DeleteObjectsResult;
import com.qcloud.cos.model.DeleteObjectsResult.DeletedObject;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.StorageClass;
import com.qcloud.cos.region.Region;
import com.service.AccountService;
import com.service.ShareService;
import com.utils.DateConvert;
import com.utils.RandomNumUtils;

@RestController
@RequestMapping("/img")
public class ImgController {
	@Autowired
	AccountService accountService;
	
	@Autowired
	ShareService shareService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value="/headUpload/{phoneNumber}", method=RequestMethod.POST)
	public String uploadHead(MultipartFile file, @PathVariable("phoneNumber") String phoneNumber)  throws IOException {
		String upload = upload(file);
		JsonElement  je = new JsonParser().parse(upload);
		JsonElement status = je.getAsJsonObject().get("status");
		if(status != null && status.getAsLong() == 0) {
			Tbuser user = new Tbuser();
			user.setPhoneNumber(phoneNumber);
			JsonElement data = je.getAsJsonObject().get("data");
			if(data != null && data.getAsString() != null) {
				user.setHead(data.getAsString());
			}
			accountService.updateUserSelectiveByPhoneNumber(user);
		}
		return upload;
	}
	
	@RequestMapping(value="/submitShare", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public String uploadShare(
			@RequestParam(value="file",required=false)MultipartFile[] file,
			Tbshare share) {
		JsonResult result = new JsonResult();
		result.setStatus(-1);
		result.setMsg("share error");		//=====================
		if(share != null) {
			Long shauid2 = share.getShauid();
			String shatext2 = share.getShatext();
			result.setMsg("sharuid: " + shauid2 + "   shatext" +shatext2);	//=====================
			Long shauid = shauid2;
			if(shauid != null) {
				result.setMsg("file error");	//=====================
				share.setShassthhId(RandomNumUtils.getId());
				share.setShatime(new Date());
				
				List<String> list = uploads(file);
				if(list !=null) {
					String img = "";
					int i = 0;
					for(String str : list) {
						if(i != 0) {
							img += ",";
						}
						img += str;
						i++;
					}
					share.setShapicture(img);
				}
				
				int insertShare = shareService.insertShare(share);
				if(insertShare != 0) {
					result.setStatus(0);
					result.setData(share);
					result.setMsg(null);		//=====================
				}
			}

		}
		return gson.toJson(result);
	}
	
	@RequestMapping(value="/submitShareWithoutImg", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public String uploadShareWithoutImg(Tbshare share) {
		JsonResult result = new JsonResult();
		result.setStatus(-1);
		result.setMsg("share error");		//=====================
		if(share != null) {
			Long shauid2 = share.getShauid();
			String shatext2 = share.getShatext();
			result.setMsg("sharuid: " + shauid2 + "   shatext" +shatext2);	//=====================
			Long shauid = shauid2;
			if(shauid != null) {
				result.setMsg("file error");	//=====================
				share.setShassthhId(RandomNumUtils.getId());
				share.setShatime(new Date());
				int insertShare = shareService.insertShare(share);
				if(insertShare != 0) {
					result.setStatus(0);
					result.setData(share);
					result.setMsg(null);		//=====================
				}
			}

		}
		return gson.toJson(result);
	}
	
	//单图片上传
	public String upload(MultipartFile file) throws IOException{  
		JsonResult result = new JsonResult();
		result.setStatus(-1);
		
		String contentType = file.getContentType();
		InputStream inputStream = file.getInputStream();
		long size = file.getSize();
		if (size != 0) {
			// 初始化用户身份信息(secretId, secretKey)
			COSCredentials cred = new BasicCOSCredentials(COSConfig.SECRETID, COSConfig.SECRETKEY);
			// 设置bucket的区域, COS地域的简称请参照
			// https://www.qcloud.com/document/product/436/6224
			ClientConfig clientConfig = new ClientConfig(new Region(COSConfig.REGION));
			// 生成cos客户端
			COSClient cosclient = new COSClient(cred, clientConfig);
			// bucket名需包含appid
			String bucketName = COSConfig.BUCKETNAME;

			// 获取后缀名
			String[] split = contentType.split("/");
			// 文件名
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");

			// 当前日期
			Date date = new Date();
			DateConvert util = new DateConvert();
			String dd = util.toString(date);

			// 目标文件名
			//String key = "/" + dd + "/" + uuid + "." + split[1];
			String key = "/" + dd + "/" + uuid + ".jpg";

			ObjectMetadata objectMetadata = new ObjectMetadata();
			// 从输入流上传必须制定content length, 否则http客户端可能会缓存所有数据，存在内存OOM的情况
			objectMetadata.setContentLength(size);
			// 默认下载时根据cos路径key的后缀返回响应的contenttype, 上传时设置contenttype会覆盖默认值
			objectMetadata.setContentType(contentType);

			PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, inputStream, objectMetadata);
			// 设置存储类型, 默认是标准(Standard), 低频(standard_ia), 近线(nearline)
			putObjectRequest.setStorageClass(StorageClass.Standard);
			try {
				cosclient.putObject(putObjectRequest);
				result.setStatus(0);
				result.setData(key.substring(1));
			} catch (CosServiceException e) {
				e.printStackTrace();
			} catch (CosClientException e) {
				e.printStackTrace();
			}
			// 关闭客户端
			cosclient.shutdown();
		}
		return gson.toJson(result);
    } 
	
	
	//批量上传图片
	public List<String> uploads(@RequestParam(value="file",required=false)MultipartFile[] file){
	    List<String> list = null;
	    if (file!=null && file.length>0) {
	    	try {
		    	list = new ArrayList<String> ();
		        for (int i = 0; i < file.length; i++) {     
					String upload = upload(file[i]);
					JsonElement  je = new JsonParser().parse(upload);
					JsonElement status = je.getAsJsonObject().get("status");
					if(status != null && status.getAsLong() == 0) {
						JsonElement data = je.getAsJsonObject().get("data");
						if(data != null && data.getAsString() != null) {
							upload = data.getAsString();
							list.add(upload);
						} 
					}
		
		        }
	    	} catch (IOException e) {
				e.printStackTrace();
			}
	    }               
	    return list;
	}
	
	
	
	
	// 批量删除文件(不带版本号, 即bucket未开启多版本)
	@RequestMapping("/del")
	@ResponseBody
	public String test2(HttpServletRequest request){  
		 // 初始化用户身份信息(secretId, secretKey)
        COSCredentials cred = new BasicCOSCredentials(COSConfig.SECRETID, COSConfig.SECRETKEY);
        // 设置bucket的区域, COS地域的简称请参照 https://www.qcloud.com/document/product/436/6224
        ClientConfig clientConfig = new ClientConfig(new Region(COSConfig.REGION));
        // 生成cos客户端
        COSClient cosclient = new COSClient(cred, clientConfig);
        // bucket名需包含appid
        String bucketName = COSConfig.BUCKETNAME;

		DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(bucketName);
		// 设置要删除的key列表, 最多一次删除1000个
		ArrayList<KeyVersion> keyList = new ArrayList<>();
		// 传入要删除的文件名
		//======================================
		//
		String img = request.getParameter("img");
		keyList.add(new KeyVersion(img));
		keyList.add(new KeyVersion("2018-04-18/4af93637b073479b98cae06176c38848.jpeg"));
		keyList.add(new KeyVersion("2018-04-18/4b566aef3b5d4b28bd12d6e32a72dad9.jpeg"));
		keyList.add(new KeyVersion("2018-04-18/tttt"));
		//============================================
		deleteObjectsRequest.setKeys(keyList);

		// 批量删除文件
		try {
			DeleteObjectsResult deleteObjectsResult = cosclient.deleteObjects(deleteObjectsRequest);
			List<DeletedObject> deleteObjectResultArray = deleteObjectsResult.getDeletedObjects();
		} catch (MultiObjectDeleteException mde) { // 如果部分产出成功部分失败,
													// 返回MultiObjectDeleteException
			List<DeletedObject> deleteObjects = mde.getDeletedObjects();
			List<DeleteError> deleteErrors = mde.getErrors();
		} catch (CosServiceException e) { // 如果是其他错误, 比如参数错误，
											// 身份验证不过等会抛出CosServiceException
			e.printStackTrace();
		} catch (CosClientException e) { // 如果是客户端错误，比如连接不上COS
			e.printStackTrace();
		}

		// 关闭客户端
		cosclient.shutdown();
	      
	      return "0";  
    }  
}
