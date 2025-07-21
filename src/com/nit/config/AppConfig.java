package com.nit.config;

import org.springframework.context.annotation.Bean;

import com.nit.sbeans.Student;
import com.nit.sbeans.University;

public class AppConfig {
	@Bean(name="delhiUniversity")
	public University delhiUniversity() {
		return new University("Delhi University");
	
		
	}
	@Bean(name= "oxfordUniversity")
	public University oxfordUniversity() {
		 return new University("OxfordUniversity");
	}
	@Bean
	public Student student() {
		return new Student(delhiUniversity());
		
	}

}
