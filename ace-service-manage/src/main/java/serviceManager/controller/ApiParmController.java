package serviceManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import serviceManager.service.IApiParmService;
import serviceManager.vo.ServiceApiParmVo;

@Controller
@RequestMapping("/apiParm")
public class ApiParmController {
	@Autowired
	private IApiParmService  apiParmService;
	
	@RequestMapping("/queryParmRespons")
	@ResponseBody
	public List<ServiceApiParmVo> queryParmRespons(Integer paramType){
		return apiParmService.queryParmRespons(paramType);
				
	}
}
