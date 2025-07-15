package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
public static void main(String []args) {
	try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);){
		WeekDayFinder finder= ctx.getBean("wf", WeekDayFinder.class);
		System.out.println("result::"+finder);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}

}
