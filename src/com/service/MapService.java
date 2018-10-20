package com.service;

import java.util.List;

import com.common.vo.MapContrastVo;
import com.common.vo.YSMap;
import com.po.Tbmap;

public interface MapService {
	List<YSMap> queryAllMap();
	MapContrastVo queryAdressByMapId(long id);
}
