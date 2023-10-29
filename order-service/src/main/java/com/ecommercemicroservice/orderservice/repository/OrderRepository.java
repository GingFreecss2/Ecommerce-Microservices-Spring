package com.ecommercemicroservice.orderservice.repository;

import com.ecommercemicroservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
