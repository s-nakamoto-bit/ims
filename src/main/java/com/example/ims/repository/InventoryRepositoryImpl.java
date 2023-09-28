package com.example.ims.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ims.entity.Inventory;
import com.example.ims.entity.InventoryForm;

@Repository
public class InventoryRepositoryImpl implements InventoryRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String selectBranchName(String branch_code) {
		String branch_name = jdbcTemplate.query("SELECT branch_name FROM m_branch WHERE branch_code = ?", String.class, branch_code);
		return branch_name;
	}

	@Override
	public String selectPersonName(String person_code) {
		return jdbcTemplate.queryForObject(
				"SELECT person_name FROM m_person WHERE person_code = ?", String.class, person_code);
	}

	@Override
	public String selectDeptName(String dept_code) {
		return jdbcTemplate.queryForObject(
				"SELECT dept_name FROM m_dept WHERE dept_code = ?", String.class, dept_code);
	}

	@Override
	public String selectClassName(String class_code) {
		return jdbcTemplate.queryForObject(
				"SELECT class_name FROM m_class WHERE class_code = ?", String.class, class_code);
	}

	@Override
	public List<Inventory> selectAll(InventoryForm inventoryForm) {

		String sql = "SELECT id, name, email, contents, created FROM inquiry";

		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

		List<Inventory> list = new ArrayList<>();

		for (Map<String, Object> result : resultList) {
			Inventory inventory = new Inventory();
			list.add(inventory);
		}
		return list;
	}

}
