package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.vo.MapContrastVo;
import com.common.vo.YSMap;
import com.google.gson.Gson;
import com.mapper.TbmapMapper;
import com.service.MapService;

@RestController
@RequestMapping("/map")
public class MapController {
	@Autowired
	TbmapMapper mapMapper;
	
	@Autowired
	MapService mapService;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	@RequestMapping(value= "/all",  produces="application/json; charset=utf-8")
	public String getMaps() {
		List<YSMap> list = mapService.queryAllMap();
		return gson.toJson(list);
	}
	
	@RequestMapping(value= "/info/{id}",  produces="application/json; charset=utf-8")
	public String queryInfoByMapId(@PathVariable("id") Long id) {
		JsonResult result = new JsonResult();
		if(id != null) {
			MapContrastVo map = mapService.queryAdressByMapId(id);
			result.setData(map);
		}
		if(result.getData() !=  null) {
			result.setStatus(0);
		} else {
			result.setStatus(-1);
		}
		
		return gson.toJson(result);
	}
}
