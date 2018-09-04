package tongji.until;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class CaseBytes {

		//bytes转16进制
		public String byte2HexString(byte[] bytes) {
			StringBuffer stringBuffer = new StringBuffer();
	        //String hex= "";
	        if (bytes != null) {
	            for (Byte b : bytes) {
	                //hex += String.format("%02X", b.intValue() & 0xFF);
	                //stringBuffer.append(String.format("%02X", b.intValue() & 0xFF));
	            	if(Integer.toHexString(b & 0xFF).length() < 2) {
	            		stringBuffer.append(0);
	            	}
	                stringBuffer.append(Integer.toHexString(b.intValue() & 0xFF));
	            }
	        }
	        return stringBuffer.toString();
	    }
		
		//16进制转bytes
		public byte[] hexStringToByteArray(String s) {
	        int len = s.length();
	        byte[] bytes = new byte[len / 2];
	        try {
	            for (int i = 0; i < len; i += 2) {
	            	bytes[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                        + Character.digit(s.charAt(i+1), 16));
	            }
	        } catch (Exception e) {
	            //Log.d("", "Argument(s) for hexStringToByteArray(String s)"+ "was not a hex string");
	        }
	        return bytes;
	    }
		
		//将图片解析成矩阵
		@Test
		public void getData(){
			File file = new File("C:/Users/huang/Desktop/project/测试/测试/N205.png");
	        try{
	        	long t1 = System.currentTimeMillis();
	            BufferedImage bimg = ImageIO.read(file);
	            int [][] data = new int[bimg.getWidth()][bimg.getHeight()];
	            StringBuffer stringBuffer = new StringBuffer();
	            //方式一：通过getRGB()方式获得像素矩阵
	            //此方式为沿Height方向扫描
	            stringBuffer.append("{");
	            for(int i=0;i<bimg.getWidth();i++){
	            	stringBuffer.append("{");
	            	if(i != 0) {
	            		stringBuffer.append(",");
	            	}
	                for(int j=0;j<bimg.getHeight();j++){
	                    data[i][j]=bimg.getRGB(i,j);
	                    if(j != 0) {
	                    	stringBuffer.append(",");
	                    }
	                    if(i==0) 
	                    stringBuffer.append(data[i][j]);
	                    
	                    //输出一列数据比对
	                    /*if(i==0)
	                        System.out.printf("%x\t",data[i][j]);*/
	                }
	                stringBuffer.append("}");
	            }
	            stringBuffer.append("}");
	            System.out.println("=====");
	            //System.out.println(stringBuffer.toString());
	            Raster raster = bimg.getData();
	            System.out.println("");
	            int [] temp = new int[raster.getWidth()*raster.getHeight()*raster.getNumBands()];
	            System.out.println(temp.toString().getBytes());
	            long t2 = System.currentTimeMillis();
	            System.out.println("方式一时间：" + (t2-t1));
	            //System.out.println(data);
	            /*System.out.println();
	            //方式二：通过getPixels()方式获得像素矩阵
	            //此方式为沿Width方向扫描
	            long t3 = System.currentTimeMillis();
	            int [] pixels  = raster.getPixels(0,0,raster.getWidth(),raster.getHeight(),temp);
	            for (int i=0;i<pixels.length;) {
	                //输出一列数据比对
	                if((i%raster.getWidth()*raster.getNumBands())==0)
	                    System.out.printf("ff%x%x%x\t",pixels[i],pixels[i+1],pixels[i+2]);
	                i+=3;
	            }
	            long t4 = System.currentTimeMillis();
	            System.out.println();
	            System.out.println("方式二时间：" + (t4-t3));*/
	        }catch (IOException e){
	            e.printStackTrace();
	        }

	    }
		
}
