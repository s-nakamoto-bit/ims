package com.example.ims.service;

import java.util.List;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

public interface InventoryService {

	List<Inventory> searchAll(InventoryForm inventoryForm);
	
	InventoryForm searchName(InventoryForm inventoryForm);

}
