package com.nit.appConfig;

import com.nit.sbeans.CarLoanCalculator;
import com.nit.sbeans.HomeLoanCalculator;
import com.nit.sbeans.LoanProcessor;

public class AppConfig {
	public static void main(String [] args) {
		 LoanProcessor homeProcessor= new LoanProcessor(new HomeLoanCalculator());
		 System.out.println("=====Home Loan ========");
		 homeProcessor.processLoan(5000.0);
		 LoanProcessor carProcessor= new LoanProcessor(new CarLoanCalculator());
		 System.out.println("===============car Loan============");
		 carProcessor.processLoan(6000);
	}

}
