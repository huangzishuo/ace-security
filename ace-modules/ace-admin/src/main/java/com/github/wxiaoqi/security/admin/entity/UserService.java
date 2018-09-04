package com.github.wxiaoqi.security.admin.entity;

import javax.persistence.Table;

@Table(name = "userservice")
public class UserService {

	/* 用户id */
	Integer userId;

	/* 服务id */
	Integer serviceId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

}
