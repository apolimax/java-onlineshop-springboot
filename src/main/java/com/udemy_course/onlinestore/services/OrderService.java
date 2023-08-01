package com.udemy_course.onlinestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy_course.onlinestore.entities.Order;
import com.udemy_course.onlinestore.repositories.OrderRepository;

//@Component
@Service // registrando como component no spring para poder ser injetado como dependência
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.get();
    }
}
