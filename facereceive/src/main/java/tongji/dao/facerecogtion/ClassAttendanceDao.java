package tongji.dao.facerecogtion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tongji.domain.facerecogtion.ClassAttendance;

public interface ClassAttendanceDao {

	//��ȡ���н�����Ϣ
	public List<ClassAttendance> getClassAttendances();
	
	//�޸Ľ�����������
	public void editAttendanceCnt(@Param("attendanceCnt")String attendanceCnt,@Param("classNo")String classNo);
}
