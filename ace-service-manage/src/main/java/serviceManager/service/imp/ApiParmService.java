package serviceManager.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serviceManager.dao.ApiParmMapper;
import serviceManager.service.IApiParmService;
import serviceManager.vo.ServiceApiParmVo;

@Service
public class ApiParmService implements IApiParmService {
	@Autowired
	private ApiParmMapper ApiParmDao;

	@Override
	public List<ServiceApiParmVo> queryParmRespons(Integer paramType) {
		// TODO Auto-generated method stub
		return ApiParmDao.queryParmRespons(paramType);
	}

}
