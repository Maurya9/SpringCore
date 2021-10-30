package com.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/refrence/ref.xml");
	A a=(A)context.getBean("a");
	B b=(B)context.getBean("b");
	System.out.println(a.getX());
	System.out.println(b.getY());
	System.out.println(a.getOb());
	

	}

}
