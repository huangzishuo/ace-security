package tongji.controller.classcourse;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tongji.domain.classcourse.User;
import tongji.service.classcourse.UserService;

@Controller  
@RequestMapping("test")  
public class UserController {  

    @Resource  
    private UserService userService;  

    @RequestMapping("/aa")    
    public String getIndex(){      
        //ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        //mav.addObject("user", user);   
        return "classinfo";    
    }    
}  