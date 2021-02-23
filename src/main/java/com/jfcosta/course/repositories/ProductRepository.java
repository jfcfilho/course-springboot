package com.jfcosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfcosta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
