package com.zycus.assignment.controller;

import java.util.List;

import javax.jms.JMSException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zycus.assignment.bean.Greeting;
import com.zycus.assignment.service.ReciverService;

@Controller
public class JMSReciverController {
	private ReciverService service;

	public void setService(ReciverService service) {
		this.service = service;
	}

	@RequestMapping(value = "/getdata")
	public ModelAndView getPersonData() {
		try {
			System.out.println("Getting Data");
			List<Greeting> greetings = service.reciveJMSMsg();
			System.out.println("Data Size" + greetings.size());
			return new ModelAndView("jms_data", "greetings", greetings);
		} catch (JMSException e) {
			e.printStackTrace();
			return null;
		}
	}
}
