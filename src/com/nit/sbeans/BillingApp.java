
package com.nit.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;

public class BillingApp {
		public static void main(String[] args) {
			AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
			CabCustomerService cab = apx.getBean(CabCustomerService.class);
			
			CabCustomer c1=new CabCustomer(101, "Rohit", "HYD", "SYD", 20, "34985498509");
			CabCustomer c2=new CabCustomer(102, "Rakesh", "Delhi", "Patna", 120, "98345764848");
			CabCustomer c3=new CabCustomer(103, "Rohit", "Rafiganj", "Gaya", 25, "099454334");
			CabCustomer c4=new CabCustomer(104, "Rohit", "Nalanda", "Rajgir", 200, "9458394545");
			cab.addCustomer(c1);
			cab.addCustomer(c2);
			cab.addCustomer(c3);
			
			String printBill = cab.printBill(c4);
			System.out.println(printBill);
			
		}
}
