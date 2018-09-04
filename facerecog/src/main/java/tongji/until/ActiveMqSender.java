package tongji.until;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import sun.misc.BASE64Encoder;


@Component
public class ActiveMqSender {
	
	@Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;
	
	//JMSTemplate��������
	public void sendMessage(Destination destination,final String msg){
        System.out.println(Thread.currentThread().getName()+" �����"+destination.toString()+"������Ϣ---------------------->"+msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
	
}
