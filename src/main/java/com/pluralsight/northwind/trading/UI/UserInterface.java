package com.pluralsight.northwind.trading.UI;

import com.pluralsight.northwind.trading.Data.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInterface implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hand in the Cookie Cutter");

    }
}
