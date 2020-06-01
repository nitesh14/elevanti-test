package com.elevati.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.elevati.web.entity.Order;
import com.elevati.web.model.Orders;
import com.elevati.web.service.OrderService;

@SpringBootApplication
public class WebApplication {
	
	@Autowired
	private OrderService service;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate, OrderService service) throws Exception {
		return args -> {

			Orders order = restTemplate.getForObject(
					"https://elevatitech.com/api/test/shopify/orders", Orders.class);
		    List<Order> orders = order.getOrders();
		    
		    //orders.forEach(System.out::println);
		    //service.saveAll(orders);
		};
	}

}
