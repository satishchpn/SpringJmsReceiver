package com.zycus.assignment.service;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import com.zycus.assignment.bean.Greeting;
import com.zycus.assignment.reciver.JmsMessageReceiver;

public class ReciverService {
	private JmsMessageReceiver receiver;

	public void setReceiver(JmsMessageReceiver receiver) {
		this.receiver = receiver;
	}

	public List<Greeting> reciveJMSMsg() throws JMSException {
		List<Greeting> greetings = new ArrayList<>();
		Greeting greeting = receiver.receive();
		greetings.add(greeting);
		return greetings;
	}
}
