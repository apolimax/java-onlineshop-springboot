package com.udemy_course.onlinestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy_course.onlinestore.entities.Category;
import com.udemy_course.onlinestore.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);

        return obj.get();
    }
}
