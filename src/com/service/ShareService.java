package com.service;

import java.util.List;

import com.common.vo.InfoVo;
import com.common.vo.PageVo;
import com.common.vo.ShareVo;
import com.po.Tbshare;

public interface ShareService {
	int insertShare(Tbshare share);
	List<ShareVo> queryAllShare(PageVo page);
	int updateHit(String id, Long uid);
	List<ShareVo> queryAllShareById(PageVo page);
	List<InfoVo> queryAllInfoById(PageVo page);
	List<InfoVo> queryAllInfoByIdWithComments(PageVo page);
	ShareVo queryShareById(String id);
	
}
