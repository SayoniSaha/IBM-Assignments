package dao;

import java.sql.SQLException;
import java.util.List;

import model.Car;

public interface CarDao {
	public Car createCar(Car car)throws SQLException;
	public List<Car> getAllCars()throws SQLException;
    public Car findByCarId(int carId) throws SQLException;

}
