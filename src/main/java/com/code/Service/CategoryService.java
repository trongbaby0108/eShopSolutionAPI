package com.code.Service;

import com.code.Entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAll();
    public void save(Category category);
    public Category findById(int id);
}
