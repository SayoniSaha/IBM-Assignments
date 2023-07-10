package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shipment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shipment {
	@Id
	@Column(name = "shipment_id")
	private int id;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private String pincode;
}
