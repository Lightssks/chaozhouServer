package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TbshopMapper;
import com.po.Tbshop;
import com.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	TbshopMapper shopMapper;
	
	public Tbshop queryShopById(String id) {
		return shopMapper.selectByPrimaryKey(id);
	}
}
