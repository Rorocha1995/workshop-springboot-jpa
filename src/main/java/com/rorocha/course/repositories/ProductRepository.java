package com.rorocha.course.repositories;

import com.rorocha.course.entities.Category;
import com.rorocha.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
