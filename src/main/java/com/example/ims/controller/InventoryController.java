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

	private final InventoryService inventoryService;
	
	@Autowired
	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	@GetMapping
	public String index(InventoryForm inventoryForm, Model model) {
		model.addAttribute("title", "在庫数参照");
		return "index";
	}

	@PostMapping
	public String confirm(@Validated InventoryForm inventoryForm, BindingResult result, Model model) {
		
		inventoryForm = inventoryService.searchName(inventoryForm);
		model.addAttribute("title", "在庫数参照");
		return "index";
	}
}
