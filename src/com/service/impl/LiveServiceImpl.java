package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.common.vo.HotelVo;
import com.common.vo.RoomVo;
import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mapper.TbhotelMapper;
import com.po.Tbhotel;
import com.redis.JedisClient;
import com.service.LiveService;
import com.utils.HotelUtils;

@Service
public class LiveServiceImpl implements LiveService {
	@Autowired
	TbhotelMapper hotelMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${HOTEL_QUERY_REDIS_KEY}")  
	private String HOTEL_QUERY_REDIS_KEY;
	
	@Value("${HOTEL_QUERY_TYPE_REDIS_KEY}")
	private String HOTEL_QUERY_TYPE_REDIS_KEY;
	
	
	public List<HotelVo> queryAllHotel(String page, String count) {
//		Gson gson = new Gson();
		//从缓存中取内容
		/*try {
			String result = jedisClient.hget(HOTEL_QUERY_REDIS_KEY, page);
			if (result!=null && !result.equals("")) {
				// 把字符串转换成list		
				List<HotelVo> resultList = 
						gson.fromJson(result, new TypeToken<List<HotelVo>>() {}.getType());
				return resultList;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		List<HotelVo> list = hotelMapper.selectHotelList();
		
		//向缓存中添加内容
		/*try {
			//把list转换成字符串
			String cacheString = gson.toJson(list);
			jedisClient.hset(HOTEL_QUERY_REDIS_KEY, page, cacheString);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return list;
	}

	public HotelVo queryHotelById(String id) {
		HotelVo hotel = hotelMapper.selectHotelById(id);
		String hotroom = hotel.getHotroom();
		
		//对获取的room信息做处理
		List<RoomVo> roomList = HotelUtils.getRoomVoList(hotroom);
		hotel.setRoom(roomList);
		hotel.setHotroom(null);
		
		//对获取的device信息做处理
		String device = hotel.getHotdevice();
		List<String> devices = HotelUtils.getDeviceVoList(device);
		hotel.setDevices(devices);
		hotel.setHotdevice(null);
		
		return hotel;
	}
	
	public List<HotelVo> queryHotelByType(String type, String page, String count) {
		Gson gson = new Gson();
		//从缓存中取内容
		try {
			String result = jedisClient.hget(HOTEL_QUERY_TYPE_REDIS_KEY + "_" + type, page);
			if (result!=null && !result.equals("")) {
				// 把字符串转换成list		
				List<HotelVo> resultList = 
						gson.fromJson(result, new TypeToken<List<HotelVo>>() {}.getType());
				return resultList;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(count));
		List<HotelVo> list = hotelMapper.selectHotelListByType(type);
		
		//向缓存中添加内容
		try {
			//把list转换成字符串
			String cacheString = gson.toJson(list);
			jedisClient.hset(HOTEL_QUERY_TYPE_REDIS_KEY + "_" + type, type, cacheString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	

	
	
	List<Tbhotel> get(String key) {
		Gson gson = new Gson();
		List<Tbhotel> resultList = null;
		//从缓存中取内容
		try {
			String result = jedisClient.get(key);
			if (result!=null && !result.equals("")) {
				// 把字符串转换成list		
				resultList = gson.fromJson(result, new TypeToken<List<HotelVo>>() {}.getType());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}


}
