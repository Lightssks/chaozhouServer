package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.vo.TourVo;
import com.github.pagehelper.PageHelper;
import com.mapper.TbtouristsMapper;
import com.service.TouristsService;

@Service
public class TouristsServiceImpl implements TouristsService {
	@Autowired
	TbtouristsMapper tourMapper;
	
	public List<TourVo> queryAllTourists(String page, String count) {
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		List<TourVo> list = tourMapper.selectAllTourists();
		for(TourVo tour : list) {
			String toupicture = tour.getToupicture();
			if(toupicture != null) {
				String[] split = toupicture.split(",|，");
				tour.setImgs(split);
				tour.setToupicture(null);
			}
			String toudescribe = tour.getToudescribe();
			if(toudescribe!=null) {
				String str2 = toudescribe.replaceAll("<.>|<.\\>", "");
				if(str2.length() > 20) {
					toudescribe = str2.substring(0, 20);
				} else {
					toudescribe = str2;
				}
				tour.setToudescribe(toudescribe);
			}
		}
		return list;
	}
	
	public TourVo queryTouristsById(String id) {
		TourVo tour = tourMapper.selectTouristsById(id);
		String toupicture = tour.getToupicture();
		if(toupicture != null) {
			String[] split = toupicture.split(",|，");
			tour.setImgs(split);
			tour.setToupicture(null);
		}
		return tour;
	}
}
