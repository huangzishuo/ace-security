package tongji.service.facerecogtion;

import java.util.List;


import tongji.domain.facerecogtion.ClassAttendance;

public interface ClassAttendanceService {

	//��ȡ����������Ϣ
	List<ClassAttendance> getClassAttendances();
	
	//�޸Ľ�����������
	void editAttendanceCnt(String attendanceCnt,String classNo);
}
