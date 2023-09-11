package com.example.ims.repository;

import java.util.List;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

public interface InventoryRepository {

	String searchBranch(String branch_code);

	String searchPerson(String person_code);

	String searchDept(String dept_code);

	String searchClass(String class_code);

	List<Inventory> searchAll(InventoryForm inventoryForm);

}
