package com.udemy_course.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy_course.onlinestore.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
