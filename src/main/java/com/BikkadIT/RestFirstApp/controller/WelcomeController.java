package com.BikkadIT.RestFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController 
{
    @GetMapping("/welcome")
	public String welcomeMgs()
	{
		String mgs ="Welcome To BikkadIT";
		
		return mgs;
	}
   
    @GetMapping("/welcome1")
    public String welcomeCity()
    { 
    	String mgs1 ="Welcome To BikkadIT,Pune";
		return mgs1;
    	
    }
    
    @RequestMapping(value="/welcome2",method=RequestMethod.GET)
    public String welcomeOffice()
    {
    	String mgs2 ="Welcome to BikkadIT Office at Dangechauk PCMC";
    	
    	return mgs2;
    }
}
