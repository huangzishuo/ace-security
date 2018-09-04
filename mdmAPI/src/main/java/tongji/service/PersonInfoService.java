package tongji.service;

import java.util.List;

import tongji.domain.mdm.PersonInfo;

public interface PersonInfoService {

	void updatePersonMoblie(String personNo, String personMoblie);

	List<PersonInfo> getInvalidPerson(String invalidDate);

	List<PersonInfo> getPersonByXgh(String[] xgh);

}
