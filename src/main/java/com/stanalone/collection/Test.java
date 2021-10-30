package com.stanalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/stanalone/collection/Alone.xml");
		Person p= con.getBean("person",Person.class);
		Person p1= con.getBean("person1",Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass());
		System.out.println("---------------------------------------------------------------");
		System.out.println(p1.getFess());
		System.out.println(p1.getFess().getClass());
	}

}
