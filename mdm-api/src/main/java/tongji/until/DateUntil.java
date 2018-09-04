package tongji.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUntil {

	
	public String  getWeeks (String startDt) {
		
	    
		Date day=new Date();   
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		long num = 0;
		   try {
	            long from = df.parse(startDt).getTime();
	            long to = df.parse(df.format(day).toString()).getTime();
	            num = (to-from)/(1000*3600*24*7);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		return String.valueOf(num);
	}
}
