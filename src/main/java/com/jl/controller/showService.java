package com.jl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showService {
	
	@RequestMapping(value="/hello")
	public String showHOme() {
		
		System.out.println("show hello");
		
		return "home";
	}
	
	
}
