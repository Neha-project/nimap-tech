package com.nimap.task.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nimap.task.demo.entity.Category;
import com.nimap.task.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	    @Autowired
	    private CategoryRepository categoryRepository;

	    public Page<Category> getCategories(int page, int size) {
	        return categoryRepository.findAll(PageRequest.of(page, size));
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).orElse(null);
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Long id, Category category) {
	        category.setId(id);
	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }
	}

