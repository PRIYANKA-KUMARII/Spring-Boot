package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.Car;

public class Main {
	public static void main(String [] args) {
		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext("com.nt.sbeans");
		Car car= ctx.getBean(Car.class);
		car.drive();
		ctx.close();
		
	}

}
