package kia.academy.blog.moduls.posts.service;

import kia.academy.blog.moduls.posts.model.Category;
import kia.academy.blog.moduls.posts.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    public Category addCategory(Category category){
     return    this.categoryRepository.save(category);
    }

    public List<Category> findAllCategory (){
        return this.categoryRepository.findAll();
    }
}
