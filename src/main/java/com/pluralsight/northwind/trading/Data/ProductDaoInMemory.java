package com.pluralsight.northwind.trading.Data;

import com.pluralsight.northwind.trading.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDaoInMemory implements ProductDao {
    private List<Product> products;
    private int nextId = 1;

    public ProductDaoInMemory() {
        this.products = new ArrayList<>();
    }

    @Override
    public Product add(Product product) {
        return product;
    }

    @Override
    public List<Product> getall() {
        return List.of();
    }
}
