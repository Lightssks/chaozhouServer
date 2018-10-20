package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.JedisClient;
import com.service.RediesService;

@RestController
@RequestMapping("cache")
public class RedisController {
	@Autowired
	RediesService redisService;
	
	@Autowired
	JedisClient jedisClient;
	
	@RequestMapping("/del/{key}")
	public String delString(@PathVariable("key") String key) {
		long delString = redisService.delString(key);
		return "del key:  " + delString;
	}
	
	@RequestMapping("/hdel/{key}/{id}")
	public String delHash(@PathVariable("key") String key, @PathVariable("id") String id) {
		long hdel = jedisClient.hdel(key, id);
		return "del key:  " + hdel;
	}
}
