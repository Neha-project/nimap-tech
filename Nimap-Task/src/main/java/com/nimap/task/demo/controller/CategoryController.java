package com.nimap.task.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.task.demo.entity.Category;
import com.nimap.task.demo.service.CategoryService;



@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	    @Autowired
	    private CategoryService categoryService;

	    @GetMapping
	    public Page<Category> getAllCategories(@RequestParam int page) {
	        return categoryService.getCategories(page, 10);
	    }

	    @PostMapping
	    public Category createCategory(@RequestBody Category category) {
	        return categoryService.createCategory(category);
	    }

	    @GetMapping("/{id}")
	    public Category getCategoryById(@PathVariable Long id) {
	        return categoryService.getCategoryById(id);
	    }

	    @PutMapping("/{id}")
	    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
	        return categoryService.updateCategory(id, category);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable Long id) {
	        categoryService.deleteCategory(id);
	    }
}
