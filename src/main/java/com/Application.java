package com;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.sbeans.SeasonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		SeasonService seasonService= ctx.getBean(SeasonService.class);
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter month number (1-12):");
		try {
			int month= sc.nextInt();
			 String season= seasonService.getSeason(month);
			 System.out.println("Season:"+season);
			 
		}catch(Exception e) {
			 }
				  System.out.println("Invalid input! Please enter a valid number between 1 and 12.");
			 }
			
		
		
	

}
