package AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.ReportGenerator;

public class Tester {
	public static void main(String [] args) {
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportGenerator report = ctx.getBean(ReportGenerator.class);
		report.getReport("Recommendation letter");
	}

}
