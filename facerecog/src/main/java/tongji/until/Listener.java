package tongji.until;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
public class Listener implements MessageListener{
	
	@Resource
	CaseBytes caseBytes;
	
	public void onMessage(Message message) {
        // 业务处理
        try {
        	//System.out.println("------------");
        	TextMessage textMessage = (TextMessage) message; 
        	String casePhoto = textMessage.getText();
            //System.out.println("响应信息为: " + textMessage.getText());
            JSONObject jsonObject = JSONObject.parseObject(casePhoto);
            String photoName = jsonObject.getString("classno");
            String photo = jsonObject.getString("photo");
            File file = new File("C:/Users/huang/Desktop/project/测试/测试/" + photoName + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //System.out.println(photo);
            fileOutputStream.write(caseBytes.hexStringToByteArray(photo));
            System.out.println(photoName + "保存成功");
            //System.out.println("接收到信息:" + stringMsg);
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
