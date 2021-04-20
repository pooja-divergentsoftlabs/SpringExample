package com.divergentslspring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class for constructor injection
 * 
 * @author Pooja Patidar
 *
 */

public class PersonApplicationContext {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/divergentslspring/IOC/person.xml");
		Person person1 =(Person)context.getBean("person1");
		System.out.println(person1);
		

	}

}
