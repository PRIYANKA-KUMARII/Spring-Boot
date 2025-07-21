package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ProfitLoss {
	private Product product;
//	private String profit;
	@Autowired
	public ProfitLoss(Product product) {
		 this.product= product;
	}
	public void calculateProfit() {
		 int profit= product.getSellingPrice()-product.getCostPrice();
		 System.out.println("Profit:"+profit);
	}
	
	

}
