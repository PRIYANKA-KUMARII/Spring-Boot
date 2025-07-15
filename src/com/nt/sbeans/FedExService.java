package com.nt.sbeans;

public class FedExService implements ShippingService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message+":FedExService");
	}

}
