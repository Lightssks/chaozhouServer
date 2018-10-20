package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.vo.SpecShopVo;
import com.github.pagehelper.PageHelper;
import com.mapper.TbspecialtyMapper;
import com.mapper.TbssMapper;
import com.po.Tbspecialty;
import com.po.TbspecialtyExample;
import com.po.TbspecialtyExample.Criteria;
import com.po.Tbss;
import com.po.TbssExample;
import com.service.SpecialtyService;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {
	@Autowired
	TbspecialtyMapper specialtyMapper;
	
	@Autowired
	TbssMapper ssMapper;
	
	public List<Tbspecialty> queryAllSpecialty(String page, String count) {
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		List<Tbspecialty> list = specialtyMapper.selectByExampleWithBLOBs(null);
		return list;
	}

	public SpecShopVo querySpecialtyById(String id) {
		return specialtyMapper.selectSpecById(id);
	}

	public List<Tbspecialty> querySpecialtyByType(String type, String page, String count) {
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		TbspecialtyExample example = new TbspecialtyExample();
		Criteria criteria = example.createCriteria();
		criteria.andSpetypeEqualTo(type);
		List<Tbspecialty> list = specialtyMapper.selectByExampleWithBLOBs(example);
		return list;
	}
	
	//根据商店Id返回特产Id
	public List<String> querySepcIdByShopId(String id) {
		TbssExample example = new TbssExample();
		com.po.TbssExample.Criteria criteria = example.createCriteria();
		criteria.andShoidEqualTo(id);
		List<Tbss> selectByExample = ssMapper.selectByExample(example);
		List<String> list = null;
		if(selectByExample != null && !selectByExample.isEmpty()) {
			list = new ArrayList<String>();
			for(Tbss specId : selectByExample) {
				list.add(specId.getSpeid());
			}
		}
		return list;
	}
	

}
