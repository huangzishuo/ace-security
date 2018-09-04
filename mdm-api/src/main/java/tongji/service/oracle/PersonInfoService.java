package tongji.service.oracle;

import java.util.List;

import tongji.domain.oracle.PersonInfo;

public interface PersonInfoService {

	
	void updatePersonMoblie(String personNo,String personMoblie);
	
	List<PersonInfo> getInvalidPerson (String invalidDate );
	
	List<PersonInfo> getPersonByXgh (String[] xgh);

	
}
