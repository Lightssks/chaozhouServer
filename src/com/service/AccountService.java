package com.service;

import com.po.Tbuser;

public interface AccountService {
	Tbuser queryUserByPhoneNumber(String phoneNumber);
	Tbuser queryUserById(Long id);
	//Tbuser login(String phoneNumber, String password, String salt);
	Tbuser login(String phoneNumber, String password);
	void register(Tbuser user);
	int updateUserSelectiveByPhoneNumber(Tbuser user);
	Tbuser queryUserByUname(String uname);

}
