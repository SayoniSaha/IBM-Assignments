package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "my_order")
@Entity

public class Order {
	@Id
	@Column(name = "order_id")
	private String id;
	@Column(name = "order_name")
	private String orderName;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Shipment shipment;
	
	public Order(String orderName, Shipment shipment) {
		super();
		this.orderName = orderName;
		this.shipment = shipment;
	}
}
