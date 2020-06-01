package com.elevati.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elevati.web.entity.Order;
import com.elevati.web.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	public void saveAll(List<Order> orders) {
		repo.saveAll(orders);
	}
	
	public List<Order> getOrders() {
		return repo.findAll();
	}
}
