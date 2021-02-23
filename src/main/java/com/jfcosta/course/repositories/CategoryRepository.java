package com.jfcosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfcosta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
