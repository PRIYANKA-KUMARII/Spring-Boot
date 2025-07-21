package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.App.AppConfig;
import com.nit.sbeans.LogManager;

public class Main {
	public static void main(String [] args) {
		ApplicationContext ctx = 
	            new AnnotationConfigApplicationContext(AppConfig.class);

	        LogManager lm = ctx.getBean(LogManager.class);
	        lm.log("This is a test log entry!");

	        System.out.println("Log written. Check app.log.");
	    }
	}
