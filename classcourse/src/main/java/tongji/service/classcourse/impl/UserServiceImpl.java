package tongji.service.classcourse.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tongji.dao.classcourse.UserDao;
import tongji.domain.classcourse.User;
import tongji.service.classcourse.UserService;
@Service
public class UserServiceImpl implements UserService {
	   @Autowired  
	    private UserDao userDao;  

	    public User selectUserById(Integer userId) {  
	    
	        return userDao.selectUserById(userId);  

	    }  
}
