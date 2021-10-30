package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.javaconfig")
public class JavaConfig {
	
	@Bean
	public Student getStudent()
	{
		Student student=new Student();
		return student;
	}

}
