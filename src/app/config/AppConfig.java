package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.DhlService;
import com.nt.sbeans.FedExService;
import com.nt.sbeans.ShippingService;

@Configuration
@ComponentScan(basePackages ="com.nt.sbeans")

public class AppConfig {
	@Bean("Fed")
	public FedExService  Fedservice() {
		return new FedExService();
		
	}
	@Bean("Dhl")
	public DhlService DhlService() {
		return new DhlService();
		
	}
	

}
