package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.vo.HotelVo;
import com.google.gson.Gson;
import com.po.Tbhotel;
import com.service.LiveService;

@RestController
@RequestMapping("/live")
public class LiveController {
	@Autowired
	LiveService liveService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value="hotelList", produces="application/json; charset=utf-8")
	public String queryAllHotel(HttpServletRequest request) {	
		String page = request.getParameter("page");
		String count = request.getParameter("count");
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<HotelVo> list = liveService.queryAllHotel(page, count);
		return gson.toJson(list);
	}
	
	@RequestMapping(value="hotelByType/{type}", produces="application/json; charset=utf-8")
	public String queryAllHotelByType(HttpServletRequest request, @PathVariable("type") String type) {
		String page = request.getParameter("page");
		String count = request.getParameter("count");
	/*	try {
			type = new String(type.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<HotelVo> list = liveService.queryHotelByType(type, page, count);
		return gson.toJson(list);
	}
	
	@RequestMapping(value="hotelInfo/{id}", produces="application/json; charset=utf-8")
	public String queryHotelById(@PathVariable("id") String id) {
		HotelVo hotel = liveService.queryHotelById(id);
		return gson.toJson(hotel);
	}
	
	
	
	
}
