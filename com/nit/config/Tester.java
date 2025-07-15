package com.nit.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.VehicleWorkshop;

public class Tester {
	 public static void main(String [] args) {
		  AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		  VehicleWorkshop workshop = ctx.getBean(VehicleWorkshop.class);
          workshop.display();
      }
  }

