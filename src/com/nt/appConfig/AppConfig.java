package com.nt.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.nt.sbeans.Department;

import com.nt.sbeans.Employee;
@Configuration
public class AppConfig {
	@Bean
	public Department depatment() {
		return  new Department("Engineering");
		
	}
	@Bean
	public Employee employee () {
		return  new Employee(1001, "Priya");
		
	}

	}

	
