package com.example.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;
import com.example.ims.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository repository;

	@Override
	public InventoryForm searchName(InventoryForm inventoryForm) {
		
		if (!(inventoryForm.getBranch_code().equals(""))) {
			inventoryForm.setBranch_name(repository.selectBranchName(inventoryForm.getBranch_code()));
		}
		
		if (!(inventoryForm.getPerson_code().equals(""))) {
			inventoryForm.setPerson_name(repository.selectPersonName(inventoryForm.getPerson_code()));
		}
		
		if (!(inventoryForm.getDept_code().equals(""))) {
			inventoryForm.setDept_name(repository.selectDeptName(inventoryForm.getDept_code()));
		}
		
		if (!(inventoryForm.getClass_code().equals(""))) {
			inventoryForm.setClass_name(repository.selectClassName(inventoryForm.getClass_code()));
		}

		return inventoryForm;
	}

	@Override
	public List<Inventory> searchAll(InventoryForm inventoryForm) {
		return repository.selectAll(inventoryForm);
	}
}
