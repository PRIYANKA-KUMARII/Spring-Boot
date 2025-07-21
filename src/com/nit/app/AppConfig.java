package com.nit.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
    // Scans com.nit.sbeans for @Component beans
}
