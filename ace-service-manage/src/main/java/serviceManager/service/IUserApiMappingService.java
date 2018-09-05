package serviceManager.service;

import java.util.List;

import serviceManager.vo.ServiceManagerVo;
import serviceManager.vo.UserApiMapping;

public interface IUserApiMappingService {
	List<UserApiMapping> queryAll();
	
	List<ServiceManagerVo> queryAllService(String userName);
}
