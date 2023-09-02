package com.shoppingmall.orderservice.repository;

import com.shoppingmall.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
