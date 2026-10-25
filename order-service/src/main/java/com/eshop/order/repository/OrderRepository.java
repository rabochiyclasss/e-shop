package com.eshop.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.order.model.Order;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
