package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller class of mvc

@Controller
public class HomeController {
    
	//controller method,returns the name of the view
	@RequestMapping("/")  //map url to this function
	public String showPage()
	{
		return "main-menu"; //not the complete name of the view
		//in the config file in WEB-INF , prefix and suffix get added. Here suffix is .jsp
		//prefix is WEB-INF/view
	}
}
