package com.nt.sbeans;

public class DhlService implements ShippingService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Message +via FedExService");
	}

}
