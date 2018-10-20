package com.common.vo;

import java.util.List;

import com.po.Tbmap;
import com.po.TbtouristsWithBLOBs;

public class TourVo extends TbtouristsWithBLOBs {
	private String[] imgs;
	
	private Tbmap map;

	public String[] getImgs() {
		return imgs;
	}

	public void setImgs(String[] imgs) {
		this.imgs = imgs;
	}

	public Tbmap getMap() {
		return map;
	}

	public void setMap(Tbmap map) {
		this.map = map;
	}
	
	
	
}
