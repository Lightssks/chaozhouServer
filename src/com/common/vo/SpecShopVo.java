package com.common.vo;

import java.util.List;

import com.po.Tbspecialty;

public class SpecShopVo extends Tbspecialty{
	private List<ShopMapVo> shop;

	public List<ShopMapVo> getShop() {
		return shop;
	}
	public void setShop(List<ShopMapVo> shop) {
		this.shop = shop;
	}
	
	
}
