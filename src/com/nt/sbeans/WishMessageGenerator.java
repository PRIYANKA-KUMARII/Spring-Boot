package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;
	public WishMessageGenerator() {
		System.out.println("Wish MessageGenerator.WishMessageGenerator()");
		
	}
	
	public void setTime(LocalTime time) {
		this.time =time;
	}	
	public String generatorWishMessage(String user) {
		int hour= time.getHour();
		if(hour<12)
			return "Good Morning ::"+user;
		else if(hour<16)
			return "Good Morning::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
					
	
	}
	
		
		
	}

