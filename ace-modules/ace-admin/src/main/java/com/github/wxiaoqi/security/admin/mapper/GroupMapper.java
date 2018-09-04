package com.github.wxiaoqi.security.admin.mapper;

import com.github.wxiaoqi.security.admin.entity.Group;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GroupMapper extends Mapper<Group> {
	public void deleteGroupMembersById(@Param("groupId") int groupId);

	public void deleteGroupLeadersById(@Param("groupId") int groupId);

	public void insertGroupMembersById(@Param("id") int id, @Param("groupId") int groupId, @Param("userId") int userId);

	public void insertGroupLeadersById(@Param("id") int id, @Param("groupId") int groupId, @Param("userId") int userId);

	public Integer getMaxId();

	public Integer getMaxIdMem();

	public Integer getMaxIdLead();
}