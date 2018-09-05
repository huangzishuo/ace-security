package serviceManager.dao;

import serviceManager.vo.ServiceApi;

public interface ServiceApiMapper {
    int insert(ServiceApi record);

    int insertSelective(ServiceApi record);
}