package com.minhaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
