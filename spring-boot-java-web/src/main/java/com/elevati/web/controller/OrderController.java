package com.elevati.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevati.web.service.OrderService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping("/orders")
	public ResponseEntity<?> getProjects() {
		try {
			return ResponseEntity.ok(service.getOrders());

		} catch (Exception e) {
			return ResponseEntity.ok(e.getMessage());
		}
	}
}
