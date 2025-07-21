package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.BillingService;
import com.nit.sbeans.FoodOrderApp;
import com.nit.sbeans.NonVegBillingService;
import com.nit.sbeans.VegBillingService;

@Configuration
public class AppConfig {
	@Bean	
	public BillingService vegBillingService() {
		return new VegBillingService();
		
	}
	@Bean
	public BillingService nonVegBillingService() {
		return new NonVegBillingService();
		
	}
	@Bean
	public FoodOrderApp foodOrderAppVeg() {
		return new FoodOrderApp(nonVegBillingService());
		
	}
	

}
