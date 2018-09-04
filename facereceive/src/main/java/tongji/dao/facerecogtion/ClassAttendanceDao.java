package tongji.dao.facerecogtion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tongji.domain.facerecogtion.ClassAttendance;

public interface ClassAttendanceDao {

	//获取所有教室信息
	public List<ClassAttendance> getClassAttendances();
	
	//修改教室已坐人数
	public void editAttendanceCnt(@Param("attendanceCnt")String attendanceCnt,@Param("classNo")String classNo);
}
