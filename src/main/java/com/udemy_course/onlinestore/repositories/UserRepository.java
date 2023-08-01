package com.udemy_course.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy_course.onlinestore.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
