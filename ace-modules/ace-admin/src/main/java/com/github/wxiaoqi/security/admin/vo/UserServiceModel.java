package com.github.wxiaoqi.security.admin.vo;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.github.wxiaoqi.security.admin.entity.UserService;

public class UserServiceModel {

	List<UserService> userServices;

	public List<UserService> getUserServices() {
		return userServices;
	}

	public void setUserServices(List<UserService> userServices) {
		this.userServices = userServices;
	}
	
}
