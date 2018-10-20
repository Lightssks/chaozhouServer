package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.vo.HistoryVo;
import com.github.pagehelper.PageHelper;
import com.mapper.TbhistoryMapper;
import com.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	@Autowired
	TbhistoryMapper historyMapper;
	
	public List<HistoryVo> queryAllHistory(String page, String count) {
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		List<HistoryVo> list = historyMapper.selectAllHistory();
		for(HistoryVo vo : list) {
			String hisdescribe = vo.getHisdescribe();
			String hispicture = vo.getHispicture();
			if(hispicture != null && !hispicture.isEmpty()) {
				String[] split = hispicture.split(",|，");
				vo.setImgs(split);
				vo.setHispicture(null);
			}
			if(hisdescribe!=null) {
				String str2 = hisdescribe.replaceAll("<.>|<.\\>", "");
				if(str2.length() > 20) {
					hisdescribe = str2.substring(0, 20);
				} else {
					hisdescribe = str2;
				}
				vo.setHisdescribe(hisdescribe);
			}
		}
		return list;
	}
	
	public HistoryVo queryHistoryVoById(String id) {
		HistoryVo vo = historyMapper.selectHistoryById(id);
		String hispicture = vo.getHispicture();
		if(hispicture != null && !hispicture.isEmpty()) {
			String[] split = hispicture.split(",|，");
			vo.setImgs(split);
			vo.setHispicture(null);
		}
		return vo;
	}
}
