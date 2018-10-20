package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.vo.MapContrastVo;
import com.common.vo.YSMap;
import com.mapper.TbmapMapper;
import com.po.Tbmap;
import com.service.MapService;

@Service
public class MapServiceImpl implements MapService {
	
	@Autowired
	TbmapMapper mapMapper;
	
	public List<YSMap> queryAllMap() {
		return  mapMapper.selectAllMaps();
	}

	@Override
	public MapContrastVo queryAdressByMapId(long id) {
		MapContrastVo map = null;
		map = mapMapper.selectHotelByMap(id);
		if(map == null || map.getContrastId() == null) {
			map = mapMapper.selectShopByMap(id);
			if(map == null  || map.getContrastId() == null) {
				map = mapMapper.selectTourByMap(id);
				if(map == null  || map.getContrastId() == null) {
					map = null;
				}
			}
		}
		return map;
	}

}
