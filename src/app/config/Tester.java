package app.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.ShipmentProcessor;
import com.nt.sbeans.ShippingService;

public class Tester {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		try {
			 AnnotationConfigApplicationContext ctx= new  AnnotationConfigApplicationContext(AppConfig.class);
			 ShipmentProcessor bean = ctx.getBean(ShipmentProcessor.class);
			 bean.display("Message via:");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
