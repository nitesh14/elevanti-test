package com.elevati.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elevati.web.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
