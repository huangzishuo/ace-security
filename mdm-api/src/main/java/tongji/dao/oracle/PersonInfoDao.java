package tongji.dao.oracle;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tongji.domain.oracle.PersonInfo;

public interface PersonInfoDao {

	
	public List<PersonInfo> getPersonInfo(@Param("personNo")String personNo,@Param("personName")String personName,
			@Param("str1")String str1,@Param("str2")String str2);
	
	public PersonInfo getPersonForUpdate(@Param("personNo")String personNo,@Param("dataType")String dataType);
	
	public List<PersonInfo> getInvalidPerson (@Param("invalidDate")String invalidDate );
	
	public List<PersonInfo> getPersonByXgh(String[] xgh);
	
	public void  updatePersonMoblie (@Param("personNo")String personNo,@Param("personMoblie")String personMoblie);
}
