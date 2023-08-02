package com.udemy_course.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy_course.onlinestore.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
