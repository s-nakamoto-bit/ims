package com.example.ims.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Inventory {

	private String product_code;
	private String procuct_name;
	private int unit_price;
	private int inventory_quantity;
	private int valuation_value;
	private int arrival_quantity_week;
	private int arrival_quantity_mon;
	private int salse_quantity_week;
	private int salse_quantity_mon;

}
