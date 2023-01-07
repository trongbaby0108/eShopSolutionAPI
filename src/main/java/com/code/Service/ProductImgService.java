package com.code.Service;

import com.code.Entity.ProductImg;
import com.code.IService.IProductImgService;
import com.code.Repository.ProductImgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImgService implements IProductImgService {

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
