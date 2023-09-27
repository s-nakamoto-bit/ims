package com.example.ims.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

@Repository
public class InventoryRepositoryImpl implements InventoryRepository {

	private final JdbcTemplate jdbcTemplate;

	public InventoryRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Inventory> searchAll(InventoryForm inventoryForm) {

		String sql = "SELECT id, name, email, contents, created FROM inquiry";

		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

		List<Inventory> list = new ArrayList<>();

		for (Map<String, Object> result : resultList) {
			Inventory inventory = new Inventory();
			list.add(inventory);
		}
		return list;
	}

	@Override
	public String searchBranchName(String branch_code) {
		return jdbcTemplate.queryForObject(
				"SELECT branch_name FROM m_branch WHERE branch_code = ?", String.class, branch_code);
	}

	@Override
	public String searchPersonName(String person_code) {
		return jdbcTemplate.queryForObject(
				"SELECT person_name FROM m_person WHERE person_code = ?", String.class, person_code);
	}

	@Override
	public String searchDeptName(String dept_code) {
		return jdbcTemplate.queryForObject(
				"SELECT dept_name FROM m_dept WHERE dept_code = ?", String.class, dept_code);
	}

	@Override
	public String searchClassName(String class_code) {
		return jdbcTemplate.queryForObject(
				"SELECT class_name FROM m_class WHERE class_code = ?", String.class, class_code);
	}

}
