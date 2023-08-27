package com.beans.erp.controller;

import com.beans.erp.model.Inventory;
import com.beans.erp.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inventories")
public class BeansInventoryController {

	@Autowired
	private InventoryService inventoryService;

	@GetMapping
	public String listInventories(Model model) {
		model.addAttribute("inventories", inventoryService.getAllInventories());
		return "BeansHome";
	}

	@GetMapping("/{id}")
	public String viewInventory(@PathVariable Long id, Model model) {
		model.addAttribute("inventory", inventoryService.getInventoryById(id));
		return "BeansHome";
	}

	@PostMapping
	public String createInventory(Inventory inventory) {
		inventoryService.saveInventory(inventory);
		return "redirect:/BeansHome";
	}

	@DeleteMapping("/{id}")
	public String deleteInventory(@PathVariable Long id) {
		inventoryService.deleteInventory(id);
		return "redirect:/BeansHome";
	}
}
