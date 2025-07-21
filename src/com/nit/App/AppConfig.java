package com.nit.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.FileLogicWriter;
import com.nit.sbeans.LogManager;
import com.nit.sbeans.LogWriter;
@Configuration
public class AppConfig {
	@Bean
	public LogWriter fileLogWriter() {
		return new FileLogicWriter();
		
		 
	}
	@Bean
	public LogManager logManager() {
		LogManager manager= new LogManager();
		manager.setLogWriter(fileLogWriter());
		return manager;
		 
	}

}
