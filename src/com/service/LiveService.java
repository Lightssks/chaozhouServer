package com.service;

import java.util.List;

import com.common.vo.HotelVo;
import com.po.Tbhotel;

public interface LiveService {
	List<HotelVo> queryAllHotel(String page, String count);
	HotelVo queryHotelById(String id);
	List<HotelVo> queryHotelByType(String type, String page, String count);
	
}
