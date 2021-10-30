package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spel/Spel.xml");
		Demo d= con.getBean("demo",Demo.class);
		System.out.println(d);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression ex=temp.parseExpression("33+63");
		System.out.println(ex.getValue());
	}

}
