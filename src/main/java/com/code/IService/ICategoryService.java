package com.code.IService;

import com.code.Entity.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> getAll();
    public void save(Category category);
    public Category findById(int id);
}
