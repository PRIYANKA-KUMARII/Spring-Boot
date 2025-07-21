package com.nit.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.LogManager;

public class Main {
	public static void main(String [] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
LogManager manager= ctx.getBean(LogManager.class);
 manager.log("Hello, Spring setter injection !");
	}

}
