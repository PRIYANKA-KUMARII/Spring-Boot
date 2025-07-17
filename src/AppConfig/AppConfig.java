package AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.ExcelReportService;
import com.nit.sbeans.PdfReportService;
import com.nit.sbeans.ReportGenerator;
import com.nit.sbeans.ReportService;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
	@Bean("Pdf")
	public  PdfReportService pdfService() {
		return new PdfReportService();
		
	}
	@Bean("Excel")
	public ExcelReportService excelService() {
		
		return new ExcelReportService();
		
	}
	
	@Bean
	public ReportGenerator getRp()
	{
		return new ReportGenerator();
	}
	
}
