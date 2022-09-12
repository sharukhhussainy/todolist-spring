package com.syedhussain.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController { 
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First Web app</title>");
		sb.append("</head>");
		sb.append("<body>My first html web page</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
