package com.nit.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CabCustomerService {
	private List<CabCustomer> customersList = new ArrayList<>();

	public void addCustomer(CabCustomer customer) {
		customersList.add(customer);
		System.out.println("Add succussfully");
	}
		
	public boolean isFirstCustomer(CabCustomer customer) {
		int count=0;
		for (CabCustomer c : customersList) {
			if (c.getPhone().equals(customer.getPhone())) {
				count++;
			}
		}
		return count<2;
	}
	
	

	public double calculateBill(CabCustomer customer) {
		if (isFirstCustomer(customer)) {
			return 0.0;
		}
		if (customer.getDistance() <= 4) {
			return 80.0;
		} else {
			return 80.0 + (customer.getDistance() - 4) * 6.0;
		}
	}
	
	 public String printBill(CabCustomer customer) {

		  return customer.getCustomerName()+",please pay your bill of Rs."+ this.calculateBill(customer);
		  
	 }
}