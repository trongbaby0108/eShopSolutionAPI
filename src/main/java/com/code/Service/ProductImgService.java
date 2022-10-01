package com.code.Service;

import com.code.Entity.Product;
import com.code.Entity.ProductImg;

import java.util.List;

public interface ProductImgService {
    public void save(ProductImg productImg);
    public List<ProductImg> getByProduct(int id);
}
