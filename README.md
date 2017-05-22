# SpringJmsReceiver
SpringJmsReceiver App Using ActiveMQ +Gradle +Xml

Run Sender Application First and Hit the Url.
http://localhost:8080/JMSProviderService/home
After filling all data click on Send.

Now run Receiver Application and hit the Url.
http://localhost:8080/JMSConsumerService/getdata


Make It Xml
------------------

Controller
-------------
public ModelAndView send(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		service.send(name);
		String msg = "Data Send Successfully...";
		return new ModelAndView("send_data", "msg", msg);
	}
  
  dispatcher-servlet.xml
  ------------------------
	<bean id="urlFilenameController"
		class="org.springframework.web.servlet.mvc.UrlFilenameViewController" />


	<bean id="urlMapping"
		class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
		<property name="mappings">
			<map>
				<entry key="send" value-ref="controller"/>
				<entry key="send_data" value-ref="urlFilenameController" />
			</map>
		</property>
	</bean>
	
  
  jsp
  --------------
	<form action="${pageContext.request.contextPath}/send">


