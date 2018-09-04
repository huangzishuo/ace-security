package tongji.dao.oracle;

import java.util.List;

import tongji.domain.oracle.ClassAttendance;


public interface ClassAttendanceDao {

	//获取所有教室信息
	public List<ClassAttendance> getClassAttendances();

}
