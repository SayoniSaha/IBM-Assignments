package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "product_name")
	private String product_name;
	@Column(name = "price")
	private double price;

}
