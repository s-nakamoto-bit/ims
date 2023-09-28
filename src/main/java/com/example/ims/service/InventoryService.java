package com.example.ims.service;

import java.util.List;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

public interface InventoryService {

	InventoryForm searchName(InventoryForm inventoryForm);

	List<Inventory> searchAll(InventoryForm inventoryForm);
	
}
