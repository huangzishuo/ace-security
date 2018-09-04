package tongji.service.oracle.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tongji.dao.oracle.PersonInfoDao;
import tongji.domain.oracle.PersonInfo;
import tongji.service.oracle.PersonInfoService;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{
	
	@Autowired
	PersonInfoDao personInfoDao;
	

	
	public void updatePersonMoblie(String personNo,String personMoblie) {
		
		  personInfoDao.updatePersonMoblie(personNo, personMoblie);
	}
	

	@Override
	public List<PersonInfo> getInvalidPerson (String invalidDate ) {
		return personInfoDao.getInvalidPerson(invalidDate);

	}

	@Override
	public List<PersonInfo> getPersonByXgh (String[] xgh){
		return personInfoDao.getPersonByXgh(xgh);

	}
}
