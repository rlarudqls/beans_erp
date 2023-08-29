package com.beans.erp.service;

import com.beans.erp.model.Order_beans;
import com.beans.erp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order_beans> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order_beans getOrderById(Long id) {
		return orderRepository.findById(id).orElse(null);
	}

	public Order_beans saveOrder(Order_beans order) {
		return orderRepository.save(order);
	}

	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}
}
