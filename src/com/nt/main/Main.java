package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.Launcher;

public class Main {
	public static void main(String [] args) {
		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		 ctx.scan("com.nt.sbeans");
		
		 ctx.refresh();
		 Launcher lau= ctx.getBean(Launcher.class);
		 lau.launcher();
		 ctx.close();
		 
		 }

}
