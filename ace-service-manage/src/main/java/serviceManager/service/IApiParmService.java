package serviceManager.service;

import java.util.List;

import serviceManager.vo.ServiceApiParmVo;

public interface IApiParmService {
	
	List<ServiceApiParmVo> queryParmRespons(Integer paramType);
}
