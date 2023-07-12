package model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter

public class Car {
	private int carId;
	private String carName;

}
