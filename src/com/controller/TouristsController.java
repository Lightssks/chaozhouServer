package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.vo.TourVo;
import com.google.gson.Gson;
import com.service.TouristsService;

@RestController
@RequestMapping("/tour")
public class TouristsController {
	@Autowired
	TouristsService tourService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value="tourlList", produces="application/json; charset=utf-8")
	public String queryAllTour(HttpServletRequest request) {
		String page = request.getParameter("page");
		String count = request.getParameter("count");
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<TourVo> list = tourService.queryAllTourists(page, count);
		return gson.toJson(list);
	}
	
	@RequestMapping(value="tourInfo/{id}", produces="application/json; charset=utf-8")
	public String queryTourById(@PathVariable("id") String id) {
		TourVo tour = tourService.queryTouristsById(id);
		return gson.toJson(tour);
	}
}
