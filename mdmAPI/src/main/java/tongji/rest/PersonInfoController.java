package tongji.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import tongji.domain.mdm.MdmBobjField;
import tongji.domain.mdm.PersonInfo;
import tongji.service.MdmBobjFieldService;
import tongji.service.PersonInfoService;

@Controller
@RequestMapping("api")
@Api("mdm")
public class PersonInfoController {

	@Autowired
	PersonInfoService personInfoService;
	
	@Autowired
	private MdmBobjFieldService mdmBobjFieldService;

	@RequestMapping("/11")
	@ResponseBody
	public String login() {
		System.out.println("ffffa");
		return "11";
	}

	@RequestMapping(value = "/getPersonInfo", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getPersonInfo(@RequestBody String jsonStr) {

		jsonStr = jsonStr.replaceAll("[\\[\\]]", "");
		jsonStr = jsonStr.replaceAll("\"", "");
		String[] str = jsonStr.split(",");
		List<PersonInfo> personInfo = personInfoService.getPersonByXgh(str);
		if (personInfo.size() == 0) {
			return null;
		}

		String jsonString = JSON.toJSONString(personInfo);
		System.out.println(jsonString);
		return jsonString;
	}

	@RequestMapping(value = "/getInvalidPerson", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getInvalidPerson(@RequestBody String jsonStr) {

		JSONObject jsonObject = JSON.parseObject(jsonStr);
		String invalidDate = jsonObject.getString("invalidDate");
		List<PersonInfo> personInfo = personInfoService.getInvalidPerson(invalidDate);
		String jsonString = JSON.toJSONString(personInfo);
		return jsonString;
	}

	@RequestMapping(value = "/getMdmInfo", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getMdmInfo(@RequestBody String jsonStr) throws Exception {
		JSONObject jsonObject = JSON.parseObject(jsonStr);
		System.out.println("str1:" + jsonStr);
		String msg = jsonStr;
		String clinentId = jsonObject.getString("clinentId");

		System.out.println("str1:" + msg);
		System.out.println("clinentId:" + clinentId);
		List<MdmBobjField> mdmBobjFieldList = mdmBobjFieldService.getMdmBobjField(clinentId);
		String str = mdmBobjFieldService.getPersonByJSONFromMDM(mdmBobjFieldList, msg);

		return str;
	}

}
