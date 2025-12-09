package com.pluralsight.northwind.trading.Data;

import com.pluralsight.northwind.trading.model.Product;

import java.util.List;

public interface ProductDao {
    Product add (Product product);
        List<Product>getall();
}
