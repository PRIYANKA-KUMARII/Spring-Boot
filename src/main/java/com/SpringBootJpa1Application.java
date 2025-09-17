package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Doctor;
import com.nit.sbeans.IDoctorService;

@SpringBootApplication
public class SpringBootJpa1Application {

	public static void main(String[] args) {
	
		ApplicationContext ctx=SpringApplication.run(SpringBootJpa1Application.class, args);
		IDoctorService service=ctx.getBean("doctorService", IDoctorService.class);
	try {
			 Doctor doctor= new Doctor();
			 doctor.setDocName("raja");
			 doctor.setSpecialization("MD-Cardio");doctor.setIncome(89000.0);
			 String resultMsg=service.registerDoctor(doctor);
			 System.out.println(resultMsg);
			 
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		((ConfigurableApplicationContext)ctx).close();
	}

}
