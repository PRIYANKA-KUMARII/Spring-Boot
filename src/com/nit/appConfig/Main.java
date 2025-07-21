package com.nit.appConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.Library;

public class Main {
public static void main(String [] args) {
    try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
		Library library= ctx.getBean(Library.class); 
		library.showBook();
	 }
	}
}
