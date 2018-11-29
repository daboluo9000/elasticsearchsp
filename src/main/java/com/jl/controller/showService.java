package com.jl.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jl.po.Book;

@Controller
public class showService {
	
	@Autowired
	@Qualifier("book")
	private Book book;
	
	
	@RequestMapping(value="/hello")
	public ModelAndView showHOme() {
		book.setAuthor("johnson");
		book.setFavor(20);
		book.setName("harry porter");
		book.setLenght(2000);
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("book", book);
		System.out.println("show hello");
		
		return mav;
	}
	
	
}
