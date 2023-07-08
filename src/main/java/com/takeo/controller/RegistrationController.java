package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.takeo.model.User;

@Controller
public class RegistrationController {
	
	
@RequestMapping("/")
	public String loadForm()
	{
		
		return "register.html";
	}
	
	@RequestMapping("/insert")
	public String handleForm(@ModelAttribute("User")   User user, Model model)
	{
		model.addAttribute("user",user);
		
		
		return "user-data.html";
	}
	
	

}
