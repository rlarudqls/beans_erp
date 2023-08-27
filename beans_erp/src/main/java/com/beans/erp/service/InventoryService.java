package com.beans.erp.service;

import com.beans.erp.model.Inventory;
import com.beans.erp.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	public List<Inventory> getAllInventories() {
		return inventoryRepository.findAll();
	}

	public Inventory getInventoryById(Long id) {
		return inventoryRepository.findById(id).orElse(null);
	}

	public Inventory saveInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}

	public void deleteInventory(Long id) {
		inventoryRepository.deleteById(id);
	}
}
