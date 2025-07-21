package com.nit.sbeans;

public class FoodOrderApp {
	private final BillingService billingService;
	public FoodOrderApp(BillingService billingService) {
		 this.billingService= billingService;
	}
	public void orderFood(String item) {
		 double price= billingService.getBill(item);
		 System.out.println("Items :"+item);
		  System.out.println("Price :Rs"+price);
		  if(price >0){
			  System.out.println("Sorry, item not found im menu.");
			  
		  }
	}
}
