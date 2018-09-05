package serviceManager.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serviceManager.dao.UserApiMappingMapper;
import serviceManager.service.IUserApiMappingService;
import serviceManager.vo.ServiceManagerVo;
import serviceManager.vo.UserApiMapping;

@Service
public class UserApiMappingService implements IUserApiMappingService{
	
	@Autowired
	private UserApiMappingMapper userApiMappingDao;
	@Override
	public List<UserApiMapping> queryAll() {
		// TODO Auto-generated method stub
		return userApiMappingDao.queryAll();
	}
	@Override
	public List<ServiceManagerVo> queryAllService(String userName) {
		// TODO Auto-generated method stub
		return userApiMappingDao.queryAllService(userName);
	}

}
