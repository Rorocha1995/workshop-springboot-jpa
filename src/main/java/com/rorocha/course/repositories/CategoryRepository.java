package com.rorocha.course.repositories;

import com.rorocha.course.entities.Category;
import com.rorocha.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
