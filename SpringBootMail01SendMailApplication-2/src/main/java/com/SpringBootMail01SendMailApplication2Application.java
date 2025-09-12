package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.IpurchaseOrder;

@SpringBootApplication
public class SpringBootMail01SendMailApplication2Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootMail01SendMailApplication2Application.class, args);

        IpurchaseOrder order = ctx.getBean("purchaseService", IpurchaseOrder.class);

        try {
            String msg = order.purchase(
                    new String[] { "Shirt", "Trouser", "Watch" },
                    new double[] { 5000, 6000, 7000 },
                    new String[] {
                            "kumaripriyanka94528@gmail.com",
                            "priyankaraj12082004@gmail.com"
                    });
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ((ConfigurableApplicationContext) ctx).close();
    }
}
