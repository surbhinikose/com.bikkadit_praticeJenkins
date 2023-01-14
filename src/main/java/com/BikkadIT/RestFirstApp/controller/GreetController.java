package com.BikkadIT.RestFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController 
{

	@GetMapping("/welcome")
	public String greetMgs()
	{
		String mgs ="Goood Morng";
		return mgs;
		
	}
	
}
