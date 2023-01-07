package com.code.IService;

import com.code.Entity.Product;
import com.code.Entity.ProductImg;

import java.util.List;

public interface IProductImgService {
    public void save(ProductImg productImg);
    public List<ProductImg> getByProduct(int id);
}
