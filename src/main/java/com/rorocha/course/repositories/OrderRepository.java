package com.rorocha.course.repositories;

import com.rorocha.course.entities.Order;
import com.rorocha.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
