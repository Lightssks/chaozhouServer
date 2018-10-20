package com.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.GsonSingleton;
import com.common.vo.InfoVo;
import com.common.vo.PageVo;
import com.common.vo.ShareVo;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mapper.TbshareMapper;
import com.mapper.TbuserMapper;
import com.po.Tbshare;
import com.po.TbshareExample;
import com.po.TbshareExample.Criteria;
import com.po.Tbuser;
import com.redis.JedisClient;
import com.service.ShareService;

@Service
public class ShareServiceImpl implements ShareService{
	@Autowired
	TbshareMapper shareMapper;
	
	@Autowired
	TbuserMapper userMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	public int insertShare(Tbshare share) {
		return shareMapper.insert(share);
	}
	
	public ShareVo queryShareById(String id) {
		ShareVo vo = shareMapper.selectShareById(id);
		if(vo != null) {
			String shapicture = vo.getShapicture();
			if(shapicture != null) {
				String[] split = shapicture.split(",");
				vo.setImgs(split);
				vo.setShapicture(null);
			}
		}
		return vo;
	}
	
	public List<ShareVo> queryAllShare(PageVo page) {
		List<ShareVo> selectAllShare = shareMapper.selectAllShare(page);
		if(selectAllShare != null && !selectAllShare.isEmpty()) {
			for(ShareVo vo : selectAllShare) {
				String shapicture = vo.getShapicture();
				if(shapicture != null) {
					String[] split = shapicture.split(",");
					vo.setImgs(split);
					vo.setShapicture(null);
				}
			}
		}
		
		return selectAllShare;
	}
	
	//分享id, 点赞人id
	public int updateHit(String id, Long uid) {
		int updateNum = 0;
		Tbshare share = null;
		Tbshare selectByPrimaryKey = shareMapper.selectByPrimaryKey(id);
		if(selectByPrimaryKey != null) {
			share = new Tbshare();
			Integer oldHit = selectByPrimaryKey.getShahit();
			if(oldHit == null) {
				oldHit = 0;
			}
			int hit = oldHit + 1;
			share.setShahit(hit);
			
			TbshareExample example = new TbshareExample();
			Criteria criteria = example.createCriteria();
			criteria.andShassthhIdEqualTo(id);
			updateNum = shareMapper.updateByExampleSelective(share, example);
			
			//将点赞信息存入Redis中
			Long shauid = selectByPrimaryKey.getShauid();
			String shatext = selectByPrimaryKey.getShatext();
			Tbuser user = userMapper.selectByPrimaryKey(uid);
			String uname = user.getUname();
			//分享用户id, 点赞用户id, 点赞用户名，分享id， 分享内容， 时间
			InfoVo vo = new InfoVo(shauid, uid, uname, id, shatext, new Date());
			String hget = jedisClient.hget("HITLIST", String.valueOf(shauid));
			List<InfoVo> fromJson = gson.fromJson(hget, 
					new TypeToken<ArrayList<InfoVo>>() {}.getType());
			if(fromJson==null || fromJson.isEmpty()) {
				List<InfoVo> list = new ArrayList<InfoVo> ();
				list.add(vo);
				jedisClient.hset("HITLIST", String.valueOf(shauid), gson.toJson(list));
			} else {
				fromJson.add(vo);
				jedisClient.hset("HITLIST", String.valueOf(shauid), gson.toJson(fromJson));
			}		
		}
		return updateNum;
	}
	
	public List<ShareVo> queryAllShareById(PageVo page) {
		List<ShareVo> list = shareMapper.selectAllShareById(page);
		if(list != null && !list.isEmpty()) {
			for(ShareVo vo : list) {
				String shapicture = vo.getShapicture();
				if(shapicture != null) {
					String[] split = shapicture.split(",");
					vo.setImgs(split);
					vo.setShapicture(null);
				}
			}
		}
		return list;
	}
	
	public List<InfoVo> queryAllInfoById(PageVo vo) {
		List<InfoVo> selectAllInfoById = null;
		if(vo != null) {
			//PageHelper.startPage(Integer.parseInt(vo.getCursor() + 1), vo.getPageSize());
			selectAllInfoById = shareMapper.selectAllInfoById(Integer.parseInt(vo.getId()));
		}
		return selectAllInfoById;
	}
	
	public List<InfoVo> queryAllInfoByIdWithComments(PageVo vo) {
		List<InfoVo> selectAllInfoById = null;
		if(vo != null) {
			//PageHelper.startPage(Integer.parseInt(vo.getCursor() + 1), vo.getPageSize());
			selectAllInfoById = shareMapper.selectAllInfoByIdWithComments(Integer.parseInt(vo.getId()));
		}
		return selectAllInfoById;
	}
	
}
