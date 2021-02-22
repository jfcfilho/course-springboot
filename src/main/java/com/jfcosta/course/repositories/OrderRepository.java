package com.jfcosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfcosta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
