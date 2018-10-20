package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.vo.HotelVo;
import com.common.vo.SpecShopVo;
import com.google.gson.Gson;
import com.po.Tbspecialty;
import com.service.SpecialtyService;

@RestController
@RequestMapping("spec")
public class SpecialtyController {
	@Autowired
	SpecialtyService specService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value="specList", produces="application/json; charset=utf-8")
	public String queryAllSpecialty(HttpServletRequest request) {
		String page = request.getParameter("page");
		String count = request.getParameter("count");
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<Tbspecialty> list = specService.queryAllSpecialty(page, count);
		for(Tbspecialty spec : list) {
			String str = spec.getSpedescribe();
			if(str != null && str != "") {
				String str2 = str.replaceAll("<.+>", "");
				if(str2.length() >  20) {
					str = str2.substring(0, 20);
				} else {
					str = str2;
				}
				
			}
			spec.setSpedescribe(str);
		}
		return gson.toJson(list);
	}
	
	@RequestMapping(value="specByType/{type}", produces="application/json; charset=utf-8")
	public String queryAllSpecByType(HttpServletRequest request, @PathVariable("type") String type) {
		String page = request.getParameter("page");
		String count = request.getParameter("count");
		
//		try {
//			type = new String(type.getBytes("ISO-8859-1"),"utf-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<Tbspecialty> list = specService.querySpecialtyByType(type, page, count);
		for(Tbspecialty spec : list) {
			String str = spec.getSpedescribe();
			if(str != null) {
				str = str.substring(0, 20);
			}
			spec.setSpedescribe(str);
		}
		return gson.toJson(list);
	}
	
	@RequestMapping(value="specInfo/{id}", produces="application/json; charset=utf-8")
	public String queryHotelById(@PathVariable("id") String id) {
		SpecShopVo specShopVo = specService.querySpecialtyById(id);
		return gson.toJson(specShopVo);
	}
	
	@RequestMapping(value="specByShopid/{id}", produces="application/json; charset=utf-8")
	public String querySepcIdByShopId(@PathVariable("id") String id) {
		JsonResult result = new JsonResult();
		if(id == null || id.equals("")) {
			result.setStatus(-1);
			result.setMsg("id不能为null");
		} else {
			List<String> list = specService.querySepcIdByShopId(id);
			result.setStatus(0);
			result.setData(list);
		}
		return gson.toJson(result);
		
	}
	
	
}
