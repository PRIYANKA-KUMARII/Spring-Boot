package com.nt.maincom.nt.sbeans;

import java.time.LocalDate;

public class WishMessageGenerator {

	private  LocalDate currentDate;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param constructor");
	}
		public void setcurentDate(LocalDate currentDate) {
		System.out.println("WishMessageGenerator.setcurrentDate()");
		this.currentDate=currentDate;
	
		
	}
		public void showWishMessage() {
			System.out.println("Today is:"+currentDate);
			
			
		}
	
}
