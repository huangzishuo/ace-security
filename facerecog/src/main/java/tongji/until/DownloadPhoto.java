package tongji.until;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DownloadPhoto{

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
	
	
	public void createPicture(String fileUrl,String fileName) throws Exception {	
	    // 构造URL
	    URL url = new URL(fileUrl);
	    // 打开连接
	    URLConnection con = url.openConnection();
	    // 输入流
	    InputStream is = con.getInputStream();
	    // 1K的数据缓冲
	    byte[] bs = new byte[1024];
	    // 读取到的数据长度
	    int len;
	    // 输出的文件流
	    OutputStream os = new FileOutputStream(fileName);
	    // 开始读取
	    while ((len = is.read(bs)) != -1) {
	      os.write(bs, 0, len);
	    }
	    // 完毕，关闭所有链接
	    os.close();
	    is.close();
	}   
	
	public byte[] getPicture(String fileUrl) throws Exception{
		// 构造URL
	    URL url = new URL(fileUrl);
	    // 打开连接
	    URLConnection con = url.openConnection();
	    // 输入流
	    InputStream is = con.getInputStream();
	    
	    byte[] bytes = new byte[1024];
	    
	    //BufferedImage bufferedImage = ImageIO.read(is);
	    
	    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	    
	    int len;
	    
	    while((len = is.read(bytes)) != -1) {
	    	byteArrayOutputStream.write(bytes, 0, len);
	    }
	    
		//ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
		
		//byte[] bytes = byteArrayOutputStream.toByteArray();
	    
	    //System.out.println("======" + byteArrayOutputStream);
		
	    is.close();
		
	    return byteArrayOutputStream.toByteArray();
	}
	
	
	public Boolean isExistFile (String url) throws IOException {
		
		File file =new File(url);    
		//如果文件夹不存在则创建    
		if  (!file.exists()  && !file.isDirectory())      
		{       
			file.mkdir();
		    return false;
		} else   
		{  
			return true;
		}  
	}
	
	
	private void createFile (String url) throws IOException {
		File file =new File(url);    
		file.createNewFile();    
	}
	
	private Boolean isFileFull (String path) {
		int fileCount = 0;
		File d = new File(path);
		File list[] = d.listFiles();
		for(int i = 0; i < list.length; i++){
		    if(list[i].isFile()){
		        fileCount++;
		    }
		}
		
		if (fileCount == 10) {
			return true;
		}  
		return false;
	}
	
	public void delPicture (String path,String str) {
		
		File d = new File(path);
		File list[] = d.listFiles();
		for(int i = 0; i < list.length; i++){
			boolean status = list[i].getName().contains(str);
			if (status) {
				list[i].delete();
			}
		}
	}
	
	private void writeFile(String fileName,String str) {  
 
	        try {  
	            FileOutputStream out = new FileOutputStream(fileName); // 输出文件路径  
	            out.write(str.getBytes());  
	            out.close();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
	  
	private String readFile(String fileName) {  
	        try {  
	            FileInputStream in = new FileInputStream(fileName); // 读取文件路径  
	            byte bs[] = new byte[in.available()];  
	            in.read(bs);  
	          //  System.out.println("file content=\n" + new String(bs));  
	            String str1 = new String(bs);
	            DecimalFormat df=new DecimalFormat("000");

	            String str2=df.format(Integer.parseInt(str1));

	         //   System.out.println(str2);
	            
	            if (str1.endsWith("10")) {
		            writeFile(fileName,"1");

	            } else {
	            	
		            writeFile(fileName,String.valueOf((Integer.parseInt(str1)+1)));

	            }
	            in.close();  
	        	return str2;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	            return null;
	        }
		
	    } 
	     
	
	    
	public void getPhoto(String url,String path) throws Exception {
		System.out.println(path);
		isExistFile(path);	
		System.out.println(!(new File(path+"/id.txt")).exists());
		if(!(new File(path+"/id.txt")).exists()) {
			createFile(path+"/id.txt");
			try {
				FileWriter fileWriter = new FileWriter(path+"/id.txt");
				fileWriter.write("1");
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String str = readFile(path+"/id.txt");
		//System.out.println(str);
		Date day=new Date();   
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss"); 
		String fileName = str+"_"+df.format(new Date()).toString()+".jpeg";
		System.out.println(fileName + "------" + url);
		Boolean bl =false;
		if (str.endsWith("10")) {
			if (!isExistFile(path+"/delid")) {
				createFile(path+"/delid");
			}else {
				delPicture(path,str);

			};

		}else {
			if (isExistFile(path+"/delid")) {
				delPicture(path,str);

			};
		}
		createPicture(url,path+"/"+fileName);
		long t2 =System.currentTimeMillis();		
	}
	
}
