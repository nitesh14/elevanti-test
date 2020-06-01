package com.elevati.web.model;

import java.util.ArrayList;
import java.util.List;
import com.elevati.web.entity.Order;

public class Orders {

	public List<Order> orders;

	public Orders() {
		orders = new ArrayList<Order>();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
