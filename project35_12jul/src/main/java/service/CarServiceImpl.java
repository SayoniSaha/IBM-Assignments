package service;

import java.sql.SQLException;
import java.util.List;

import dao.CarDao;
import model.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carService")
public class CarServiceImpl implements CarService {
	private final CarDao carDao;

	@Autowired
	public CarServiceImpl(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public Car createCar(Car car) throws SQLException {
		return carDao.createCar(car);
	}

	@Override
	public List<Car> getAllCars() throws SQLException {
		return carDao.getAllCars();
	}
	
	@Override
	public Car findByIdService(int carId) throws SQLException {
	    return carDao.findByCarId(carId);
	}

}
