package com.example.ims.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class InventoryForm {

	@NotBlank
	//@Pattern(regexp = "[0-9]{5}")
	private String branch_code;
	
	private String branch_name;
	
	@NotBlank
	//@Pattern(regexp = "[0-9]{5}")
	private String person_code;
	
	private String person_name;

	//@Pattern(regexp = "[0-9]{5}")
	private String dept_code;
	
	private String dept_name;
	
	//@Pattern(regexp = "[0-9]{5}")
	private String class_code;
	
	private String class_name;
}
