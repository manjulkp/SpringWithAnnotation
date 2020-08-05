package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main()------starting Sc ");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("main()------started Sc ");
		
		Person p1 = (Person)ctx.getBean("person");
		
		System.out.println("p1=="+p1);
		
		p1.dance();
	}

}
