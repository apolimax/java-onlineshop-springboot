package com.udemy_course.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy_course.onlinestore.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
