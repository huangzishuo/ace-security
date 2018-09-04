package tongji.controller.facerecogtion;

import javax.annotation.Resource;
import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import tongji.service.facerecogtion.ClassAttendanceService;
import tongji.until.CaseBytes;

@Component
public class Listener implements MessageListener{
	
	@Resource
	CaseBytes caseBytes;
	
	@Autowired
	ClassAttendanceService classAttendanceService;
	
	public void onMessage(Message message) {
        // 业务处理
        try {
        	if(message != null) {
            	BytesMessage bytesMessage = (BytesMessage) message; 
            	byte[] bytes = new byte[1024];
            	StringBuffer stringBuffer = new StringBuffer();
            	int len = -1;
            	while((len=bytesMessage.readBytes(bytes)) != -1) {
            		stringBuffer.append(new String(bytes, 0, len));
            	}
            	String casePhoto = stringBuffer.toString();
                System.out.println("响应信息为: " +casePhoto);
                JSONObject jsonObject = JSONObject.parseObject(casePhoto);
                String classno = jsonObject.getString("classno");
                String num = jsonObject.getString("num");
                classAttendanceService.editAttendanceCnt(num, classno);
        	}
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
