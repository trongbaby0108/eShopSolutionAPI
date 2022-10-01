package com.code.Controller;

import com.code.Entity.Category;
import com.code.Entity.Product;
import com.code.Service.CategoryService;
import com.code.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/Save")
    public String getAll(@RequestParam("name") String name){
        Category category = new Category();
        category.setName(name);
        categoryService.save(category);
        return "Success";
    }
}
