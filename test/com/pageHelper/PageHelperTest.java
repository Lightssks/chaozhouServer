package com.pageHelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.TbhotelMapper;
import com.po.Tbhotel;

import junit.framework.TestCase;

public class PageHelperTest extends TestCase {
	ApplicationContext applicationContext;
	
	protected void setUp() throws Exception {
		applicationContext = 
				new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
	}
	
	/*@Test
	public void test() {
		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
		
		//执行sql语句之前设置分页信息使用PageHelper的startPage方法
		PageHelper.startPage(1, 10);
		
		//执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		
		//取分页信息，PageInfo。1、总记录数2、总页数 。当前页码
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getPages());
		System.out.println(list.size());
	}*/
	
	@Test
	public void test() {
		TbhotelMapper hoteMapper = applicationContext.getBean(TbhotelMapper.class);
		
		//执行sql语句之前设置分页信息使用PageHelper的startPage方法
		PageHelper.startPage(1, 2);
		List<Tbhotel> list = hoteMapper.selectByExample(null);
		//System.out.println(list);
		System.out.println(list.isEmpty());
		PageInfo<Tbhotel> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getPages());
		System.out.println(list.size());
		System.out.println("list================");
		System.out.println(list);
		for(Tbhotel hotel : list) {
			System.out.println(hotel.getHotssthhId());
		}
		List<Tbhotel> list2 = pageInfo.getList();
		System.out.println("list2================");
		System.out.println(list2);
		for(Tbhotel hotel : list2) {
			System.out.println(hotel.getHotssthhId());
		}
			
	}

}
