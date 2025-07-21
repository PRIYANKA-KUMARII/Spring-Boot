package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class ShoppingContext {
	private ShoppingService shoppingService;

	public ShoppingContext(@Qualifier("amazonService")ShoppingService shoppingService) {
		
		this.shoppingService = shoppingService;
	}
	public void setShoppingService(ShoppingService shoppingService) {
		this.shoppingService=shoppingService;
	}

	public void addItem(String item, double price) {
		 shoppingService.addItem(item,  price);
	}
	public void viewCart() {
		 shoppingService.viewCart();
	}
	public void checkout() {
		 shoppingService.checkout();
	}
	
}
