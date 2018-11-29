package com.jl.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jl.po.Book;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class testsp {

	
	
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
		Book book = ac.getBean("book", Book.class);
		
		book.setID(1);
	
		System.out.println(book.getID());
		
	}
}
