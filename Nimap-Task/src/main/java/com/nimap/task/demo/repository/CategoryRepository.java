package com.nimap.task.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.task.demo.entity.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}

