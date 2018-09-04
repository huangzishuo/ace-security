package tongji.service.classcourse;

import java.util.Date;
import java.util.List;

import tongji.domain.classcourse.Course;

public interface CourseService {
	List<Course> getAll(String str1,String str2,String str3);
	
	List<String[]> getOne(List<Course> courses);
	
	String getJsonString(String str);
	
	String[] getClassName(String classno);
	
	String getDate();
}
