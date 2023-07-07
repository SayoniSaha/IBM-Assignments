package org.example.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "RoadVehicleSingle")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "roadVehicle")
@DiscriminatorColumn(name = "vehicle_type", discriminatorType = DiscriminatorType.STRING)
@Setter
@Getter

@DiscriminatorValue("ROAD VEHICLE")

public class RoadVehicle {
    public enum AcclerationType {
        PADDLE, THROTTLE
    }

    @Id
    @Column(name = "vehicle_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = "no_of_passengers")
    protected int noPassengers;

    @Column(name = "no_of_wheels")
    protected int noWheels;

    @Column(name = "company")
    protected String company;

    @Column(name = "model")
    protected String model;

    public RoadVehicle() {
        super();
    }
}