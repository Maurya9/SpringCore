package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student);
        Student student1=(Student) context.getBean("student1");
        System.out.println(student1);
        Student student2=(Student) context.getBean("student2");
        System.out.println(student2);
    }
}
