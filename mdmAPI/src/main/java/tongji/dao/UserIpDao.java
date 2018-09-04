package tongji.dao;

import org.apache.ibatis.annotations.Param;

import tongji.domain.service.UserIp;

public interface UserIpDao {

	/*
	 * 获取用户ip
	 * */
	public UserIp getUserIp(@Param("username")String username);
}
