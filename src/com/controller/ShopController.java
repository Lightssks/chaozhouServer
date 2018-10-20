package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.po.Tbshop;
import com.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	ShopService shopService;
	
	@RequestMapping(value="/nameById/{id}", produces="application/json; charset=utf-8")
	public String queryNameById(@PathVariable("id") String id) {
		Tbshop shop = shopService.queryShopById(id);
		return shop.getShoname();
	}
}
