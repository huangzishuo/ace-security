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
	
	//��ͼƬ���ֽ���ʮ������ת����ƴ�ӳ�json�ַ���
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
	
	//���༶��ź�ͼƬ��BASE64���벢ƴ�ӳ�json�ַ���
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
		
	//����json�ַ�������base64�����ͼƬ����
    public void decoderMessage(Message message) {
    	BASE64Decoder decoder = new BASE64Decoder();
        try {  
        	System.out.println("------------");
        	TextMessage textMessage = (TextMessage) message; 
        	String casePhoto = textMessage.getText();
            System.out.println("��Ӧ��ϢΪ: " + textMessage.getText());
            JSONObject jsonObject = JSONObject.parseObject(casePhoto);
            String photoName = jsonObject.getString("classno");
            String photo = jsonObject.getString("photo");
            byte[] bytes = decoder.decodeBuffer(photo);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
            File file = new File("C:/Users/huang/Desktop/project/����/����/" + photoName + ".png");
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("����ɹ�");
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
             File file = new File("C:/Users/huang/Desktop/project/����/����/" + photoName + ".png");
             ImageIO.write(bufferedImage, "png", file);
             System.out.println("����ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
