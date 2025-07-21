package com.nit.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.MessageFormatter;
import com.nit.sbeans.NotificationSender;
import com.nit.sbeans.NotificationSystem;
import com.nit.sbeans.SmsSender;

@Configuration
public class AppConfig {
	@Bean
	public NotificationSender smsSender() {
		return new SmsSender("Sms");
		
	}
	@Bean
	public MessageFormatter formatter() {
		return new MessageFormatter();
	}
	@Bean
	public NotificationSystem notificationSystem() {
		NotificationSystem sms= new NotificationSystem(smsSender());
		sms.setFormatter(formatter());
		return sms;
		
	}
	

}
