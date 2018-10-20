package com.service;

import java.util.List;

import com.common.vo.SpecShopVo;
import com.po.Tbspecialty;

public interface SpecialtyService {
	List<Tbspecialty> queryAllSpecialty(String page, String count);
	SpecShopVo querySpecialtyById(String id);
	List<Tbspecialty> querySpecialtyByType(String type, String page, String count);
	List<String> querySepcIdByShopId(String id);
}
