package com.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClientTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testJedisSingle() {
		try {
			//创建一个jedis的对象。
			Jedis jedis = new Jedis("193.112.86.153", 6379);
			//jedis.auth("root");
			//调用jedis对象的方法，方法名称和redis的命令一致。
			jedis.set("username", "zy");
		
			String string = jedis.get("username");
			System.out.println(string);
			//关闭jedis。
			jedis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	/**
	 * 单机版测试
	 * <p>Title: testSpringJedisSingle</p>
	 * <p>Description: </p>
	 */
	@Test
	public void testSpringJedisSingle() {
		try{
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
			JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
			Jedis jedis = pool.getResource();
			String string = jedis.get("username");
			System.out.println(string);
			jedis.close();
			pool.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
