package com.example.ims.repository;

import java.util.List;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

public interface InventoryRepository {

	String selectBranchName(String branch_code);

	String selectPersonName(String person_code);

	String selectDeptName(String dept_code);

	String selectClassName(String class_code);

	List<Inventory> selectAll(InventoryForm inventoryForm);

}
