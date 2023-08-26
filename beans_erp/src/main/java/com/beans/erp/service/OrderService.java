package com.beans.erp.service;


import com.beans.erp.model.Order;
import com.beans.erp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

 @Autowired
 private OrderRepository orderRepository;

 public List<Order> getAllOrders() {
     return orderRepository.findAll();
 }

 public Order getOrderById(Long id) {
     return orderRepository.findById(id).orElse(null);
 }

 public Order saveOrder(Order order) {
     return orderRepository.save(order);
 }

 public void deleteOrder(Long id) {
     orderRepository.deleteById(id);
 }
}
