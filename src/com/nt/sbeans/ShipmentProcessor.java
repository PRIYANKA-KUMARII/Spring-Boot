package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShipmentProcessor  {
 ShippingService service;
 @Autowired
 public ShipmentProcessor(@Qualifier("Dhl") ShippingService service)
 {
	this.service=service; 
 }
 public void display(String msg)
 {
	service.sendMessage(msg); 
 }
}
