package serviceManager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import serviceManager.vo.ApiParm;
import serviceManager.vo.ServiceApiParmVo;

public interface ApiParmMapper {
    int insert(ApiParm record);

    int insertSelective(ApiParm record);
    
    List<ServiceApiParmVo>queryParmRespons(@Param("paramType") Integer paramType);
}