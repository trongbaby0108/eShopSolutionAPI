package com.code.Service;

import com.code.Entity.Product;
import com.code.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void disable(int id) {
        Product product = productRepository.findById(id).get();
        product.setEnable(false);
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getByCategory(int id) {
        List<Product> res = new ArrayList<>();
        for (Product product: productRepository.findAll()) {
            if(product.getCategory().getId() == id){
                res.add(product);
            }
        }
        return res;
    }
}
