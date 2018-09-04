package tongji.controller.classcourse;  
  
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tongji.domain.classcourse.Course;
import tongji.service.classcourse.CourseService;
import tongji.until.classcourse.DateUntil;  
  
@Controller
@RequestMapping(value="/course")
public class CourseController { 
  
@Autowired  
private CourseService courseService;

   @RequestMapping(value="/getCourse/{str1}/{classno}" , method = RequestMethod.GET) 
   public String getCourse(@PathVariable String str1,@PathVariable String classno,Model model){ 
	  DateUntil demoUntils = new DateUntil();
	  String str3 = demoUntils.getWeeks(courseService.getJsonString("��ѧʱ��"));
	  String term =courseService.getJsonString("ѧ��");
	  String str2;
	  if (Integer.valueOf(str3).intValue()%2 ==0) {
		  str2="2";
	  } else {
		  str2="1";
	  }
	  String str = courseService.getJsonString(str1);
	  List<Course> courses = courseService.getAll(str1,str2,str3);
	  String[] telphone = courseService.getClassName(classno);
	  List<String[]> lists = courseService.getOne(courses);
	  String date = courseService.getDate();
	  model.addAttribute("date",date);
	  model.addAttribute("lists",lists);
	  model.addAttribute("term",term);
	  model.addAttribute("telphone",telphone);
 	  model.addAttribute("courses",courses);
 	  model.addAttribute("title",str);
      return "hello"; 
   } 
   
   @Test
   public void test () {
	   System.out.println("=====================success");
	   Date date = new Date();
   		String[] str = {"��", "һ", "��", "��", "��", "��", "��", "��", "��", "��"};
   		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("M");
	    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd");
	    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("EEEE");
	    String s1 = simpleDateFormat1.format(date);
	    String s2 = simpleDateFormat2.format(date);
	    String s3 = simpleDateFormat3.format(date);
	    StringBuffer sb = new StringBuffer();
	    for(int i=0;i<s2.length();i++) {
		   String index = String.valueOf(s2.charAt(i));   
		   if(i==0) {
			   sb = sb.append(str[Integer.parseInt(index)]).append("ʮ");
		   }else {
			   sb = sb.append(str[Integer.parseInt(index)]);
		   }
	    }
	    StringBuffer stringBuffer = new StringBuffer();
	    stringBuffer.append(s1).append("��").append(sb.toString()).append("��").append(s3).append("�γ�");
	    System.out.println(stringBuffer.toString());
	   /*System.out.println(this.getClass().getResource("").getPath());
	   try {
		FileReader fileReader = new FileReader("src/main/resources/class.json");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String readline;
		while((readline=bufferedReader.readLine())!=null) {
			stringBuffer.append(readline);
		}
		System.out.println(stringBuffer);
		JSONObject jsonObject = JSON.parseObject(stringBuffer.toString());
		String title = jsonObject.getString("N101");
		System.out.println(title);
	} catch (Exception e) {
		e.printStackTrace();
	}*/
   }
}