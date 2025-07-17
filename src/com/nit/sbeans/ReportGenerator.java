package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//@Component
public class ReportGenerator {
	@Autowired
	@Qualifier("Pdf")
	private  ReportService reportService;
	
	public void getReport(String report) {
		reportService.generateReport(report);
	}
}
