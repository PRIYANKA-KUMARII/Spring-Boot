package com.nit.sbeans;

//@Component
public class PdfReportService implements ReportService {

	@Override
	public void generateReport(String report) {
		System.out.println("Report+ via Pdf for "+report);
		
	}

}
