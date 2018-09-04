package com.github.wxiaoqi.security.admin.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.wxiaoqi.security.admin.entity.UserService;
import com.github.wxiaoqi.security.admin.mapper.UserServiceMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceBiz extends BaseBiz<UserServiceMapper, UserService>{

	@Resource
	UserServiceMapper userServiceMapper;
	
	public List<String> getService(Integer id){
		return userServiceMapper.getService(id);
	}
	
	public void addService(Integer userId, Integer serviceId) {
		userServiceMapper.addService(userId, serviceId);
	}
}
