package  tongji.dao.classcourse;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tongji.domain.classcourse.Course;

public interface CourseDao {
	public List<Course> getAll(@Param("str1")String str1,@Param("str2")String str2,@Param("str3")String str3);


}
