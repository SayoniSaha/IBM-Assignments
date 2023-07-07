package org.example.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.ToString;

@Entity
@DiscriminatorValue("CAR")
@ToString
@Table(name = "car")

public class Car extends RoadVehicle {

	@Enumerated(EnumType.STRING)
	public final AcclerationType acclerationType = AcclerationType.PADDLE;
	
	public Car() {
		super();
		noWheels = 4;
		noPassengers = 5;
		company = "Maruti";
		model = "Honda";
	}
}
