package com.service;

import java.util.List;

import com.common.vo.TourVo;

public interface TouristsService {
	List<TourVo> queryAllTourists(String page, String count);
	TourVo queryTouristsById(String id);
}
