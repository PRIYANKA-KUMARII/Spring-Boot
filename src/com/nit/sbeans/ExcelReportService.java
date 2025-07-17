package com.nit.sbeans;

//@Component
//@Primary
public class ExcelReportService implements ReportService {

	@Override
	public void generateReport(String report) {
		System.out.println("Report +via PdfReprotService for "+report);
		
	}

}
