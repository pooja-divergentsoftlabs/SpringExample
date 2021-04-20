package com.divergentslspring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class for Setter Injection
 * 
 * @author Pooja Patidar
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student student1 = (Student)context.getBean("student1");
    	System.out.println(student1);
         
    }
}