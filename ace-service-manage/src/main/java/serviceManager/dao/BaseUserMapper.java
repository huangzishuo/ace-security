package serviceManager.dao;

import serviceManager.vo.BaseUser;

public interface BaseUserMapper {
    int insert(BaseUser record);

    int insertSelective(BaseUser record);
}