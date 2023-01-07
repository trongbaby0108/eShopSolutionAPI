package com.code.Controller;

import com.code.Entity.Category;
import com.code.IService.ICategoryService;
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
    private ICategoryService ICategoryService;

    @RequestMapping("/getAll")
    public List<Category> getAll(){
        return ICategoryService.getAll();
    }

    @PostMapping("/Save")
    public String getAll(@RequestParam("name") String name){
        Category category = new Category();
        category.setName(name);
        ICategoryService.save(category);
        return "Success";
    }
}
