package com.nit.sbeans;

public class SmsSender implements NotificationSender {
private final String provider;
public SmsSender(String provider) {
	 this.provider= provider;
}
	@Override
	public void send(String recipient, String message) {
		System.out.println("Sending SMS via"+provider+"to"+recipient+":"+message);
	}

}
