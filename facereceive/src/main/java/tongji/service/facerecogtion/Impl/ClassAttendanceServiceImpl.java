package tongji.service.facerecogtion.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tongji.dao.facerecogtion.ClassAttendanceDao;
import tongji.domain.facerecogtion.ClassAttendance;
import tongji.service.facerecogtion.ClassAttendanceService;

@Service
public class ClassAttendanceServiceImpl implements ClassAttendanceService {
	
	@Autowired
	ClassAttendanceDao classAttendanceDao;

	@Override
	public List<ClassAttendance> getClassAttendances() {
		return classAttendanceDao.getClassAttendances();
	}

	@Override
	public void editAttendanceCnt(String attendanceCnt, String classNo) {
		classAttendanceDao.editAttendanceCnt(attendanceCnt, classNo);
	}

	
}
