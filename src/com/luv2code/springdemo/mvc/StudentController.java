package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm") //we create a new object and add that as an attribute to the model
	public String showForm(Model model) {
		
		Student s = new Student();
		
		model.addAttribute("student", s); //bind object to model
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student s) //@ModelAttribute will be required to access the model attribute
	{
		System.out.println(s.getFirstName()); //logging of data
		System.out.println(s.getLastName());
		return "student-confirmation"; //view returned by this
	}

}
