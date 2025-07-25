package com.nit.appConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.PlayerService;

public class Main {
	public static void main(String [] args) {
		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
			 PlayerService service= ctx.getBean(PlayerService.class);
		 service.displayPlayerInfo();
	}

}
