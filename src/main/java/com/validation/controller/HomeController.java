package com.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.models.LoginDetails;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("loginDetails", new LoginDetails());
		
		return "index";
	}
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute LoginDetails details,
							   BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			System.out.println(result);
		}else {
			model.addAttribute("success", "Registration successful");
		}
		
		System.out.println(details);
		return "index";
	}

}
