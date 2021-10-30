package com.sterotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/sterotype/annotation/Stero.xml");
		Student s= con.getBean("student",Student.class);
		System.out.println(s);
		System.out.println(s.getAddress());
		System.out.println(s.hashCode());
		
		Student ss= con.getBean("student",Student.class);
		System.out.println(ss.hashCode());
		

	}

}
