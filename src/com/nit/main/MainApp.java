package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.app.AppConfig;
import com.nit.sbeans.Student;

public class MainApp {

	public static void main(String []args) {
		  try (AnnotationConfigApplicationContext  ctx= new AnnotationConfigApplicationContext(AppConfig.class)) {		 
			  Student student= ctx.getBean(Student.class);
			  student.printUniversityName();
		  }
	}
}
