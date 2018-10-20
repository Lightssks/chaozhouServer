package com.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.vo.InfoVo;
import com.common.vo.PageVo;
import com.common.vo.ShareVo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.redis.JedisClient;
import com.service.ShareService;

@RequestMapping("/share")
@RestController
public class ShareController {
	@Autowired
	ShareService shareService;
	
	@Autowired
	private JedisClient jedisClient;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value="/all", produces="application/json; charset=utf-8")
	public String queryAllShare(HttpServletRequest request) {
		String cursor = request.getParameter("cursor");
		String pageSize = request.getParameter("pageSize");
		if(cursor == null || cursor.equals("")) {
			cursor = "0";
		}
		if(pageSize == null || pageSize.equals("")) {
			pageSize = "10";
		}
		PageVo pageVo = new PageVo();
		pageVo.setCursor(cursor);
		pageVo.setPageSize(Integer.parseInt(pageSize));
		List<ShareVo> list = shareService.queryAllShare(pageVo);
		return gson.toJson(list);
	}
	
	@RequestMapping(value="/shareInfo/{id}", produces="application/json; charset=utf-8")
	public String queryShareById(@PathVariable("id") String id) {
		JsonResult result = new JsonResult();
		if(id == null) {
			result.setStatus(-1);
			result.setMsg("shareId不能为null");
		} else {
			ShareVo vo = shareService.queryShareById(id);
			result.setData(0);
			result.setData(vo);
		}
		return gson.toJson(result);
	}
	
	
	@RequestMapping(value="/giveLove/{id}/{uid}", method=RequestMethod.POST)
	public String giveLove(@PathVariable("id") String id, @PathVariable("uid") Long uid) {
		int updateHit = shareService.updateHit(id, uid);
		JsonResult result = new JsonResult();
		result.setStatus(-1);
		if(updateHit != 0) {
			result.setStatus(0);
		}
		return gson.toJson(result);
	}
	
	@RequestMapping(value="/getShare/{id}", produces="application/json; charset=utf-8")
	public String getShareById(HttpServletRequest request, @PathVariable("id") String id) {
		JsonResult result = new JsonResult();
		if(id == null || id.equals("")) {
			result.setStatus(-1);
			result.setMsg("id不能为空");
		} else{
			PageVo page = new PageVo(request, id);
			List<ShareVo> queryAllShareById = shareService.queryAllShareById(page);
			result.setStatus(0);
			result.setData(queryAllShareById);
		}
		return gson.toJson(result);
	}
	
	//获取用户分享被评论和点赞消息
	@RequestMapping(value="/info/{id}", produces="application/json; charset=utf-8")
	public String test2(HttpServletRequest request, @PathVariable("id") String id) {
		JsonResult result = new JsonResult();
		if(id != null && id != "") {
			PageVo vo = new PageVo(request, id);
			List<InfoVo> queryAllInfoById = shareService.queryAllInfoByIdWithComments(vo);
			
			//点赞消息
			String hget = jedisClient.hget("HITLIST", String.valueOf(id));
			List<InfoVo> fromJson = gson.fromJson(hget, 
					new TypeToken<ArrayList<InfoVo>>() {}.getType());
			
			//合并，排序
			if(fromJson !=null) {
				fromJson.addAll(queryAllInfoById);
			} else {
				fromJson = queryAllInfoById;
			}
			Collections.sort(fromJson, new Comparator<InfoVo>(){
				@Override
				public int compare(InfoVo o1, InfoVo o2) {
					//time为空的设为最大值,即最新
					if(o1.getTime() == null) {
						return 1;
					}  else if (o2.getTime() == null) {
						return -1;
					}
					return  o2.getTime().compareTo(o1.getTime());
				}
			});
			
			String cursor = request.getParameter("cursor");
			String pageSize =  request.getParameter("pageSize");
			if(cursor == null || "".equals(cursor)) {
				cursor = "1";
			}
			if(pageSize == null || "".equals(pageSize)) {
				pageSize = "10";
			}
			int page = Integer.parseInt(cursor);
			int count = Integer.parseInt(pageSize);
			
			int start = page * count - count;
			int end = page * count;
			result.setStatus(0);
			if(start >= fromJson.size()) {
				result.setData(null);
			} else {
				if(end >= fromJson.size()) {
					end = fromJson.size() ;
				} 
				result.setData(fromJson.subList(start, end));
			}	
			
		} else {
			result.setStatus(-1);
			result.setMsg("id不能为空");
		}
		return gson.toJson(result);
	}
	
	@RequestMapping(value="/test", produces="application/json; charset=utf-8")
	public String test(HttpServletRequest request) {
		PageVo vo = new PageVo(request, "1");
		List<InfoVo> queryAllInfoById = shareService.queryAllInfoById(vo);
		return gson.toJson(queryAllInfoById);
	}
}
