package service;

import java.sql.SQLException;
import java.util.List;

import model.Car;

public interface CarService {
	public Car createCar(Car car)throws SQLException;
	public List<Car> getAllCars()throws SQLException;
    public Car findByIdService(int carId) throws SQLException;

}
