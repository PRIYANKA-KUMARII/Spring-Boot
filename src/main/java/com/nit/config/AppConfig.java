package com.nit.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.ShoppingContext;
import com.nit.sbeans.ShoppingService;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")

public class AppConfig {
	
	

}

