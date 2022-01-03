package kia.academy.blog.moduls.posts.controller;


import kia.academy.blog.moduls.posts.model.Category;
import kia.academy.blog.moduls.posts.service.CategoryService;
import kia.academy.blog.moduls.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    private CategoryService categoryService ;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @RequestMapping(value = {"" , "/"} , method = RequestMethod.POST)
    public Category addCategory (@RequestBody Category category){
        return this.categoryService.addCategory(category);

    }
    @RequestMapping(value = {"","/"} , method = RequestMethod.GET)
    public List<Category> findAllCategory(){
        return this.categoryService.findAllCategory();
    }
}
