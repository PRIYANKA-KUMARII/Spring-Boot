package com.nit.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Student;

public class MainApp {
    public static void main(String[] args) {
      
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Student student = context.getBean(Student.class);

                student.printUniversityName();
    }
}
