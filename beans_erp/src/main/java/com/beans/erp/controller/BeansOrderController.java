package com.beans.erp.controller;

import com.beans.erp.model.Order_beans;
import com.beans.erp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class BeansOrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping
	public String listOrders(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "BeansOrderManagement";
	}

	@GetMapping("/{id}")
	public String viewOrder(@PathVariable Long id, Model model) {
		model.addAttribute("order", orderService.getOrderById(id));
		return "BeansHome";
	}

	@PostMapping
	public String createOrder(Order_beans order) {
		orderService.saveOrder(order);
		return "redirect:/BeansHome";
	}

	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
		return "redirect:/BeansHome";
	}
}
