package com.github.wxiaoqi.security.admin.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.wxiaoqi.security.admin.biz.UserServiceBiz;
import com.github.wxiaoqi.security.admin.entity.UserService;
import com.github.wxiaoqi.security.admin.vo.UserServiceModel;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;

@RestController
@RequestMapping("userService")
public class UserServiceController{

	@Resource
	UserServiceBiz userServiceBiz;

	@RequestMapping(value = "/getService" , method = RequestMethod.GET)
	public String getService(@RequestParam("id") Integer id) {
		return JSON.toJSONString(userServiceBiz.getService(id));
	}

	@PostMapping("addServices")
	public ObjectRestResponse<UserService> addServices(@RequestBody UserServiceModel userServiceModel) {
		for (UserService userService : (userServiceModel.getUserServices())) {
			userServiceBiz.insertSelective(userService);
		}
		return new ObjectRestResponse<UserService>();
	}
}
