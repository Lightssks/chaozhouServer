package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.vo.HistoryVo;
import com.common.vo.HotelVo;
import com.common.vo.SpecShopVo;
import com.google.gson.Gson;
import com.service.HistoryService;

@RestController
@RequestMapping("/history")
public class HistoryController {
	private static Gson gson = GsonSingleton.getInstance();
	
	@Autowired
	private HistoryService historyService;
	
	@RequestMapping(value="historyList", produces="application/json; charset=utf-8")
	public String queryAllHistory(HttpServletRequest request) {	
		String page = request.getParameter("page");
		String count = request.getParameter("count");
		if(page == null || page.equals("")) {
			page = "1";
		}
		if(count == null || count.equals("")) {
			count = "10";
		}
		List<HistoryVo> list = historyService.queryAllHistory(page, count);
		return gson.toJson(list);
	}
	
	@RequestMapping(value="historyInfo/{id}", produces="application/json; charset=utf-8")
	public String queryHotelById(@PathVariable("id") String id) {
		HistoryVo queryHistoryVoById = historyService.queryHistoryVoById(id);
		return gson.toJson(queryHistoryVoById);
	}
	
	
}
