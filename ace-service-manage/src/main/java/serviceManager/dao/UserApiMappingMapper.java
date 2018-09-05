package serviceManager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import serviceManager.vo.ServiceManagerVo;
import serviceManager.vo.UserApiMapping;

public interface UserApiMappingMapper {
    int insert(UserApiMapping record);

    int insertSelective(UserApiMapping record);
    
    List<UserApiMapping> queryAll();
    
    List<ServiceManagerVo> queryAllService(@Param("userName")String userName);
}