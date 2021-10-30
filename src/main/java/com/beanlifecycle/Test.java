package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/beanlifecycle/BeanLifeCycle.xml");
	/*
	 * BeanClass bean=(BeanClass) context.getBean("bean"); System.out.println(bean);
	 */
	
	Example example=(Example)context.getBean("employee");
	System.out.println(example);
	context.registerShutdownHook();
	

	}

}
