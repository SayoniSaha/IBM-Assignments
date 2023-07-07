package org.example.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

@DiscriminatorValue("MOTOR CYCLE")
@Table(name = "motorcycle")

public class MotorCycle extends RoadVehicle {
	@Enumerated(EnumType.STRING)
	public final AcclerationType acclerationType = AcclerationType.THROTTLE;
	
	public MotorCycle() {
		super();
		noWheels = 2;
		noPassengers = 2;
		company = "Yamaha";
		model = "Avenger";
	}
}
