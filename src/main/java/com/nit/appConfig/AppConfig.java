package com.nit.appConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages="com.nit.sbeans")
@Configuration
@PropertySource("com/nit/sbeans/Info.properties")
public class AppConfig {

}
