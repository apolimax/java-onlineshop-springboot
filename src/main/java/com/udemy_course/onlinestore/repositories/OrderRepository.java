package com.udemy_course.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy_course.onlinestore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
