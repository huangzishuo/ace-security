package tongji.service.oracle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tongji.dao.oracle.ClassAttendanceDao;
import tongji.domain.oracle.ClassAttendance;
import tongji.service.oracle.ClassAttendanceService;


@Service
public class ClassAttendanceServiceImpl implements ClassAttendanceService {
	
	@Autowired
	ClassAttendanceDao classAttendanceDao;

	@Override
	public List<ClassAttendance> getClassAttendances() {
		return classAttendanceDao.getClassAttendances();
	}

}
