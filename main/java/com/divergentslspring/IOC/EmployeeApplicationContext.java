package com.divergentslspring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class for Setter Injection
 * 
 * @author Pooja Patidar
 *
 */

public class EmployeeApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divergentslspring/IOC/employee.xml");
		Employee employee1 = (Employee)context.getBean("employee1");
		System.out.println(employee1);
	}

}
