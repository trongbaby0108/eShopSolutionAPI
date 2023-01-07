package com.code.IService;

import com.code.Entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAll();
    public void save(Product product);
    public void disable(int id);
    public Product findById(int id);
    public List<Product> getByCategory(int id);
}
