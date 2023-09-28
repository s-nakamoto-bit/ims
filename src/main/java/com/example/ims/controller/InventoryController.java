package com.example.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ims.entity.InventoryForm;
import com.example.ims.service.InventoryService;

@Controller
public class InventoryController {

	@Autowired
	private InventoryService service;

	@GetMapping
	public String index(InventoryForm inventoryForm, Model model) {
		model.addAttribute("title", "在庫数参照");
		return "index";
	}

	@PostMapping
	public String confirm(@Validated InventoryForm inventoryForm, BindingResult result, Model model) {
		model.addAttribute("title", "在庫数参照");

		inventoryForm = service.searchName(inventoryForm);

		if (result.hasErrors()) {
			return "index";
		}

		return "index";
	}
}
