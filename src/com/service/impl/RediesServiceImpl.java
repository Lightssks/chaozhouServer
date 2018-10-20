package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redis.JedisClient;
import com.service.RediesService;

@Service
public class RediesServiceImpl implements RediesService {
		
	@Autowired
	JedisClient jedisClient;
	
	@Override
	public long delString(String key) {
		return jedisClient.del(key);
	}
	
	
}
