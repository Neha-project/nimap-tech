package com.nimap.task.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.task.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
