package tongji.until;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@Component
public class BaseEnDe {
	
	@Resource
	CaseBytes caseBytes;
	
	//将图片的字节以十六进制转换并拼接成json字符串
	public String casePhoto(String path,byte[] bytes) {
		String hexstr = caseBytes.byte2HexString(bytes);
		String casePhoto = null;
		try {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("{\"classno\":\"").append(path).append("\",\"").append("photo\":\"").append(hexstr).append("\"}");
			casePhoto = stringBuffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return casePhoto;
	}
	
	//将班级编号和图片以BASE64编码并拼接成json字符串
		public String encoderPhoto(byte[] bytes,String path) {
			BufferedImage bufferedImage;
			BASE64Encoder encoder = new BASE64Encoder();
			String casePhoto = null;
			try {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				//StringBuffer stringBuffer = new StringBuffer();
				//stringBuffer.append("{\"classno\":\"").append(path).append("\",\"").append("photo\":\"").append(encoder.encodeBuffer(bytes).trim()).append("\"}");
				//casePhoto = stringBuffer.toString();
				casePhoto = "{\"classno\":\"" + path + "\",\"" + "photo\":\"" + encoder.encodeBuffer(bytes).trim() + "\"}";
				System.out.println(casePhoto);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return casePhoto;
		}
		
	//解析json字符串并对base64编码的图片解码
    public void decoderMessage(Message message) {
    	BASE64Decoder decoder = new BASE64Decoder();
        try {  
        	System.out.println("------------");
        	TextMessage textMessage = (TextMessage) message; 
        	String casePhoto = textMessage.getText();
            System.out.println("响应信息为: " + textMessage.getText());
            JSONObject jsonObject = JSONObject.parseObject(casePhoto);
            String photoName = jsonObject.getString("classno");
            String photo = jsonObject.getString("photo");
            byte[] bytes = decoder.decodeBuffer(photo);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
            File file = new File("C:/Users/huang/Desktop/project/测试/测试/" + photoName + ".png");
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("保存成功");
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
    } 
    
    public void getPh(byte[] bytes,String photoName) {
    	BASE64Decoder decoder = new BASE64Decoder();
    	try {
    		 //byte[] bytes = decoder.decodeBuffer(photo);
             ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
             BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
             File file = new File("C:/Users/huang/Desktop/project/测试/测试/" + photoName + ".png");
             ImageIO.write(bufferedImage, "png", file);
             System.out.println("保存成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
