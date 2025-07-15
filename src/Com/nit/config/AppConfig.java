package Com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Com.nit.enginess","Com.nit.factory","Com.nit.vehicles"})
public class AppConfig {

}
