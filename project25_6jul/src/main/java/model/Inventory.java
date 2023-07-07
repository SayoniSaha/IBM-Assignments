package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "inventory")
@Entity
@ToString

public class Inventory {
	@Id
	@Column(name = "inventory_id")
	private int invent_id;
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "product_name")
	private String product_name;
	@Column(name = "quantity")
	private int quantity;
	
	public Inventory(int product_id, String product_name, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.quantity = quantity;
	}

}
