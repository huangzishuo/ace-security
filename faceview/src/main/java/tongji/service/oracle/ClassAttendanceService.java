package tongji.service.oracle;

import java.util.List;

import tongji.domain.oracle.ClassAttendance;



public interface ClassAttendanceService {

	//获取教室所有信息
	List<ClassAttendance> getClassAttendances();
	
}
