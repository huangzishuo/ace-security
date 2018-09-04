package tongji.controller.oracle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import tongji.domain.oracle.ClassAttendance;
import tongji.service.oracle.ClassAttendanceService;

@Controller
@RequestMapping("classinfo")
public class ClassInfoController {

	@Autowired
	ClassAttendanceService classAttendanceService;
	
	@RequestMapping("getClassInfo")
	public String getClassInfo(Model model) {
		List<ClassAttendance> classAttendances = classAttendanceService.getClassAttendances();
		model.addAttribute("classAttendances",classAttendances);
		//String jsonstr = JSONObject.toJSONString(classAttendances);
		return "class";
	}
	
	@RequestMapping("getClassInfoAjax")
	@ResponseBody
	public String getClassInfoAjax() {
		List<ClassAttendance> classAttendances = classAttendanceService.getClassAttendances();
		String jsonstr = JSONObject.toJSONString(classAttendances);
		return jsonstr;
	}
}
