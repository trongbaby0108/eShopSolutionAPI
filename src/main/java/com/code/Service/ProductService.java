package com.code.Service;

import com.code.Entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public void save(Product product);
    public void disable(int id);
    public Product findById(int id);
    public List<Product> getByCategory(int id);
}
