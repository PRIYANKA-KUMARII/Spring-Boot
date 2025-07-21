package com.nt.appConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Department;
import com.nt.sbeans.Employee;

public class Tester {
	public static void main(String [] args) {
			AnnotationConfigApplicationContext ctx= new  AnnotationConfigApplicationContext(AppConfig.class);
			Employee emp = ctx.getBean(Employee.class);
	        emp.printDetails();
	    }
}
