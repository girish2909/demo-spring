package com.spring;

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
        
        ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/config.xml");
        Student student = (Student)context.getBean("student1");
        System.out.println(student);
        System.out.println("----------------------------");
        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);
    }
}
