package com.nit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.NotificationSystem;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
NotificationSystem system= ctx.getBean(NotificationSystem.class);
system.notify("+234567", "Your order has been shipped");
	}

}
