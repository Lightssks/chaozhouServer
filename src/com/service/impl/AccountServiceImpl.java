package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mapper.TbuserMapper;
import com.po.Tbuser;
import com.po.TbuserExample;
import com.po.TbuserExample.Criteria;
import com.service.AccountService;
import com.utils.MD5Utils;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	TbuserMapper userMapper;
	
	public Tbuser queryUserByPhoneNumber(String phoneNumber) {
		TbuserExample example = new TbuserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneNumberEqualTo(phoneNumber);
		
		List<Tbuser> list = userMapper.selectByExample(example);
		Tbuser user = null;
		if(list != null && !list.isEmpty()) {
			user = list.get(0);
		}
		return user;
	}
	
	public Tbuser queryUserById(Long id) {
		Tbuser user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	
//	public Tbuser login(String phoneNumber, String password, String salt) {
//		TbuserExample example = new TbuserExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andPhoneNumberEqualTo(phoneNumber);
//		List<Tbuser> list = userMapper.selectByExample(example);
//		Tbuser user = null;
//		if(list != null && !list.isEmpty()) {
//			user = list.get(0);
//			String realpwd = user.getPassword();
//			realpwd = MD5Utils.encrypt(realpwd, salt);
//			if(realpwd.equals(password)) {
//				user.setPassword(null);
//			} else {
//				user = null;
//			}
//		}
//		return user;
//	}
	
	public Tbuser login(String phoneNumber, String password) {
		TbuserExample example = new TbuserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneNumberEqualTo(phoneNumber);
		criteria.andPasswordEqualTo(password);
		List<Tbuser> list = userMapper.selectByExample(example);
		Tbuser user = null;
		if(list != null && !list.isEmpty()) {
			user = list.get(0);
		}
		return user;
	}

	public void register(Tbuser user) {
		userMapper.insertSelective(user);
	}

	@Override
	public int updateUserSelectiveByPhoneNumber(Tbuser user) {
		TbuserExample example = new TbuserExample();
		Criteria criteria = example.createCriteria();
		String phoneNumber = user.getPhoneNumber();
		if(phoneNumber == null || phoneNumber.equals("")) {
			return 0;
		}
		criteria.andPhoneNumberEqualTo(phoneNumber);
		return userMapper.updateByExampleSelective(user, example);
	}
	
	public Tbuser queryUserByUname(String uname) {
		TbuserExample example = new TbuserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(uname);
		List<Tbuser> list = userMapper.selectByExample(example);
		Tbuser user = null;
		if(list != null && !list.isEmpty()) {
			user = list.get(0);
		}
		return user;
	}
	
}
