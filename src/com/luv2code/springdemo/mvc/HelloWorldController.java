package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form"; //name of the view to be returned
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@PostMapping("/processForm2")
	public String processForm2(HttpServletRequest request,Model model)
	{
		String name = request.getParameter("studentName"); //same name as is in form attribute
		String uname = name.toUpperCase();
		String res = "hi " + uname;
		model.addAttribute("message",res);
		return "helloworld"; // name of the view to be returned
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("studentName") String name,Model model) //binding using annotations RequestParam
	{
		
		String uname = name.toUpperCase();
		String res = "hi " + uname;
		model.addAttribute("message",res);
		return "helloworld"; // name of the view to be returned
	}

}
