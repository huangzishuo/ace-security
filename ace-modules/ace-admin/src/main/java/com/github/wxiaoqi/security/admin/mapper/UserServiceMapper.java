package com.github.wxiaoqi.security.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.wxiaoqi.security.admin.entity.UserService;

import tk.mybatis.mapper.common.Mapper;

public interface UserServiceMapper extends Mapper<UserService> {

	/* 通过用户id获取授权服务 */
	List<String> getService(@Param("id") Integer id);

	/* 添加用户服务 */
	void addService(@Param("userId") Integer userId, @Param("serviceId") Integer serviceId);
}
