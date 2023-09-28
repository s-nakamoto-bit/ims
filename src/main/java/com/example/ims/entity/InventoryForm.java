package com.example.ims.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class InventoryForm {

	@NotBlank(message = "支店コード未入力")
	@Pattern(regexp = "[0-9]{5}")
	private String branch_code;

	private String branch_name;

	@NotBlank(message = "担当者コード未入力")
	@Pattern(regexp = "[0-9]{5}")
	private String person_code;

	private String person_name;

	@Pattern(regexp = "[0-9]{5}")
	private String dept_code;

	private String dept_name;

	@Pattern(regexp = "[0-9]{5}")
	private String class_code;

	private String class_name;
}
