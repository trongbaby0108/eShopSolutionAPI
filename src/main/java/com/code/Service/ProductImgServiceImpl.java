package com.code.Service;

import com.code.Entity.Product;
import com.code.Entity.ProductImg;
import com.code.Repository.ProductImgRepository;
import com.code.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImgServiceImpl implements ProductImgService{

    @Autowired
    private ProductImgRepository ProductImgRepository;

    @Override
    public void save(ProductImg productImg) {
        ProductImgRepository.save(productImg);
    }

    @Override
    public List<ProductImg> getByProduct(int id) {
        return ProductImgRepository.getByProduct(id);
    }
}
