package com.pluralsight.northwind.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class NorthWindTradersSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NorthWindTradersSpringBootApplication.class, args);

// Logging code to show you what Spring Boot is actually doing
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("\nMy Application Beans:");
        for (String beanName : beanNames) {
            Object bean = context.getBean(beanName);
            String packageName = bean.getClass().getPackageName();
            if (packageName.startsWith("com.pluralsight.northwind.trading")) {
                System.out.println(beanName + " -> " + bean.getClass().getSimpleName());
            }
        }

    }
}
