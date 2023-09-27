package com.example.ims.repository;

import java.util.List;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

public interface InventoryRepository {

	String searchBranchName(String branch_code);

	String searchPersonName(String person_code);

	String searchDeptName(String dept_code);

	String searchClassName(String class_code);

	List<Inventory> searchAll(InventoryForm inventoryForm);

}
