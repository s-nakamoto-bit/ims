package com.example.ims.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;
import com.example.ims.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	private final InventoryRepository repo;

	public InventoryServiceImpl(InventoryRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Inventory> searchAll(InventoryForm inventoryForm) {
		return repo.searchAll(inventoryForm);
	}

	@Override
	public InventoryForm searchName(InventoryForm inventoryForm) {
		if (!(inventoryForm.getBranch_code().equals(""))) {
			inventoryForm.setBranch_name(repo.searchBranchName(inventoryForm.getBranch_code()));
		}
		if (!(inventoryForm.getPerson_code().equals(""))) {
			inventoryForm.setPerson_name(repo.searchPersonName(inventoryForm.getPerson_code()));
		}
		if (!(inventoryForm.getDept_code().equals(""))) {
			inventoryForm.setDept_name(repo.searchDeptName(inventoryForm.getDept_code()));
		}
		if (!(inventoryForm.getClass_code().equals(""))) {
			inventoryForm.setClass_name(repo.searchClassName(inventoryForm.getClass_code()));
		}

		return inventoryForm;
	}

}
