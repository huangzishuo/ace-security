package tongji.service.classcourse.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import tongji.dao.classcourse.CourseDao;
import tongji.domain.classcourse.Course;
import tongji.service.classcourse.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	    @Autowired  
	    private CourseDao courseDao; 

	    //��ȡ���ܿγ�
	    public List<Course> getAll(String str1,String str2,String str3) {  
	   
	        return courseDao.getAll(str1, str2, str3);  

	    }  
	    
	    //��ȡ����γ�
	    public List<String[]> getOne(List<Course> courses){
	      List<String[]> lists = new ArrayList<>();
	      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		  String month = simpleDateFormat.format(new Date());
	  	  for(Course course:courses) {
	  		  if(month.equals("����һ")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim1();
	  			  lists.add(sts);
	  		  }else if(month.equals("���ڶ�")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim2();
	  			  lists.add(sts);
	  		  }else if(month.equals("������")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim3();
	  			  lists.add(sts);
	  		  }else if(month.equals("������")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim4();
	  			  lists.add(sts);
	  		  }else if(month.equals("������")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim5();
	  			  lists.add(sts);
	  		  }else if(month.equals("������")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim6();
	  			  lists.add(sts);
	  		  }if(month.equals("������")) {
	  			  String[] sts = new String[2];
	  			  sts[0] = course.getDim0();
	  			  sts[1] = course.getDim7();
	  			  lists.add(sts);
	  		  }
	  	  }
	  	  return lists;
	    }
	    
	    //��ȡjson�ļ�����jsonֵ
	    public String getJsonString(String str) {
	    	String stri = null;
	    	try {
				FileReader fileReader = new FileReader(this.getClass().getResource("/").getPath()+"class.json");
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String readline;
				while((readline=bufferedReader.readLine())!=null) {
					stringBuffer.append(readline);
				}
				bufferedReader.close();
				JSONObject jsonObject = JSON.parseObject(stringBuffer.toString());
				stri = jsonObject.getString(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	return stri;
	    }
	    
	    //ͨ����ʦ��Ż�ȡ��ʦ����
	    public String[] getClassName(String classno) {
	    	String[] telphone = new String[3];
	  	  if(classno.equals("0")) {
	  		 telphone[0] = "�������ۺϷ������ߣ�65983756";
	  		 telphone[1] = "ѧУ�������绰       ��65982404";
	  		 telphone[2] = "ѧУҽԺ����绰    ��65983221";
	  	  }
	  	  else {
	  		  telphone[0] = "�������ۺϷ������ߣ�65983756";
	  		  telphone[1] = "ѧУ�������绰       ��65982404";
	  		  telphone[2] = "ѧУҽԺ����绰    ��65983221";
	  	  }
	  	  return telphone;
	    }
	    
	    //��ȡ��������
	    public String getDate() {
	    	Date date = new Date();
	   		String[] str = {"��", "һ", "��", "��", "��", "��", "��", "��", "��", "��"};
	   		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("M");
		    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd");
		    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("EEEE");
		    String s1 = simpleDateFormat1.format(date);
		    String s2 = simpleDateFormat2.format(date);
		    String s3 = simpleDateFormat3.format(date);
		    StringBuffer stringBuffer = new StringBuffer();
		    stringBuffer.append(s1).append("��").append(s2).append("��").append(s3).append("�γ�");
	    	return stringBuffer.toString();
	    }
}
