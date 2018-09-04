package tongji.service.facerecogtion;

import java.util.List;


import tongji.domain.facerecogtion.ClassAttendance;

public interface ClassAttendanceService {

	//获取教室所有信息
	List<ClassAttendance> getClassAttendances();
	
	//修改教室已坐人数
	void editAttendanceCnt(String attendanceCnt,String classNo);
}
