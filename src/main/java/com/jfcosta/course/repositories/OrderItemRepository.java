package com.jfcosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfcosta.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
