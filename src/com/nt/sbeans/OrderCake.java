package com.nt.sbeans;

public class OrderCake extends Cake {
	private String message_on_cake;

	public OrderCake() {
		super();
	}

	public OrderCake(String flavour, float quantity, String cake_Of_Shape) {
		super(flavour, quantity, cake_Of_Shape);
	}

	public OrderCake(String flavour, float quantity, String cake_Of_Shape,String message_on_cake) {
		super(flavour, quantity, cake_Of_Shape);
		this.message_on_cake = message_on_cake;
	}

	
	@Override
	public String getOrderCake() {
		return toString();
	}

	@Override
	public String toString() {
		return "OrderCake [message_on_cake=" + message_on_cake + ", toString()=" + super.toString() + "]";
	}

	
	
		 }