package com.zycus.assignment.reciver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.springframework.jms.core.JmsTemplate;

import com.zycus.assignment.bean.Greeting;

public class JmsMessageReceiver {
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	private JmsTemplate jmsTemplate;

	public Greeting receive() throws JMSException {
		Message message = jmsTemplate.receive();
		ObjectMessage objectMessage = (ObjectMessage) message;
		Greeting greeting = (Greeting) objectMessage.getObject();
		System.out.println("Received  : " + greeting);
		return greeting;

	}

}
