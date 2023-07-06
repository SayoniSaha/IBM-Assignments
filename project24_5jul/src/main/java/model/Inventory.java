package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Inventory {
	private int i_id;
	private int product_id;
	private String product_name;
	private double price;
	private int Quantity;
}
