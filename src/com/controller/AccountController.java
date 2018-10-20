package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.GsonSingleton;
import com.common.JsonResult;
import com.common.sms.IndustrySMS;
import com.google.gson.Gson;
import com.po.Tbuser;
import com.redis.JedisClient;
import com.service.AccountService;
import com.utils.JsonUtil;
import com.utils.MD5Utils;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${USER_RALT_REDIS_KEY}")  
	private String USER_RALT_REDIS_KEY;
	
	private static Gson gson = GsonSingleton.getInstance();
	
	//发起验证请求
	@RequestMapping(value="/auth/{phoneNumber}", method=RequestMethod.POST)
	public String authRequest(@PathVariable("phoneNumber") String phoneNumber) {
		Tbuser user = accountService.queryUserByPhoneNumber(phoneNumber);
		String ralt = MD5Utils.getSalt();
		jedisClient.hset(USER_RALT_REDIS_KEY, user.getUid().toString(), ralt);
		return ralt;
	}
	
	//登陆
	@RequestMapping(value="/login", produces="application/json; charset=utf-8", method=RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String phoneNumber = request.getParameter("phoneNumber");
		String password = request.getParameter("password");
		//Tbuser user2 = accountService.queryUserByPhoneNumber(phoneNumber);
		//String salt = jedisClient.hget(USER_RALT_REDIS_KEY, user2.getUid().toString());	
		//Tbuser user = accountService.login(phoneNumber, password, salt);
		Tbuser user = accountService.login(phoneNumber, password);
		JsonResult result = new JsonResult();
		if(user == null) {
			result.setStatus(-1);
			return gson.toJson(result);
		} else {
			user.setPassword(null);
			result.setStatus(0);
			result.setData(user);
			return gson.toJson(result);
		}
	}
	
	//手机验证
	@RequestMapping(value="/smsAuth", method=RequestMethod.POST)
	public String smsAuth(HttpServletRequest request) {
		String phoneNumber = request.getParameter("phoneNumber");
		//判断手机号码是否已注册
		Tbuser queryUserByPhoneNumber = accountService.queryUserByPhoneNumber(phoneNumber);
		if(queryUserByPhoneNumber != null) {
			return "-2";
		}
		
		Integer num = (int)((Math.random()*9+1)*100000);  
		String result = IndustrySMS.execute(phoneNumber, num.toString());
		JsonUtil util = new JsonUtil();
		util.setJsonObject(result);
		String param = util.getParameter("respCode");
		if(param.equals("00000")) {
			return num.toString();
		} else {
			return "-1";
		}
	}
	
	
	//注册
	@RequestMapping(value="/register", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public String register(Tbuser user) {
		JsonResult result = new JsonResult();
		if(user == null || user.getPhoneNumber() == null || user.getPassword() == null) {
			result.setData(-1);
			result.setMsg("账号信息填写不完整");
			return "-1";
		}
		result.setStatus(0);
		accountService.register(user);
		return gson.toJson(result);
		
	}
	
	//找回密码
	@RequestMapping(value="/findpwd", method=RequestMethod.POST)
	public String findPwd(HttpServletRequest request, Tbuser user) {
		//String userJSON = request.getParameter("user");
		//Tbuser user = gson.fromJson(userJSON, Tbuser.class);
		
		int updateCount = accountService.updateUserSelectiveByPhoneNumber(user);
		JsonResult result = new JsonResult();
		if(updateCount == 0) {
			result.setStatus(-1);
			return gson.toJson(result);
		} else {
			result.setStatus(0);
			return gson.toJson(result);
		}
	}
	
	//根据用户名查找用户
	@RequestMapping(value="/userByUname/{uname}", produces="application/json; charset=utf-8")
	public String findUserByUname(@PathVariable("uname") String uname) {
		Tbuser user = accountService.queryUserByUname(uname);
		if(user != null) {
			user.setPassword(null);
		}
		return gson.toJson(user);
	}
	
	//根据手机号码查找用户
	@RequestMapping(value="/userByPhone/{phoneNumber}", produces="application/json; charset=utf-8")
	public String findUserByPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
		Tbuser user = accountService.queryUserByPhoneNumber(phoneNumber);
		if (user != null) {
			user.setPassword(null);
		}
		return gson.toJson(user);
	}
	
	//根据用户名查找用户
	@RequestMapping(value = "/userById/{id}", produces = "application/json; charset=utf-8")
	public String findUserById(@PathVariable("id") Long id) {
		Tbuser user = accountService.queryUserById(id);
		if (user != null) {
			user.setPassword(null);
		}
		return gson.toJson(user);
	}
	
	
	//根据手机号码修改用户信息
	@RequestMapping(value="/updateByPhone", produces="application/json; charset=utf-8", method=RequestMethod.POST)
	public String UpdateUserByPhoneNumber(Tbuser user) {
		int updateCount = accountService.updateUserSelectiveByPhoneNumber(user);
		JsonResult result = new JsonResult();
		if(updateCount == 0) {
			result.setStatus(-1);
			return gson.toJson(result);
		} else {
			result.setStatus(0);
			return gson.toJson(result);
		}
	}
}
