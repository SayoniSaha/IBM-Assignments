package com.springjdbc.project35_12jul;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sql.DataSource;
//import com.mchange.v2.c3p0.ComboPooledDataSource;

import config.SpringConfig;
import dao.CarDao;
import model.Car;
import service.CarService;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try {
//            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//            DataSource dataSource = context.getBean("dataSource", ComboPooledDataSource.class);
//            Car c = context.getBean("car", Car.class);
//            c.setCarId(567);
//            c.setCarName("TYU");
//            Connection conn = dataSource.getConnection();
//
//            PreparedStatement pst = conn.prepareStatement("insert into car values(?,?)");
//            pst.setInt(1, c.getCarId());
//            pst.setString(2, c.getCarName());
//            pst.executeUpdate();
//            System.out.println("Successful");
//
//            PreparedStatement pst2 = conn.prepareStatement("select * from car");
//            ResultSet rs = pst2.executeQuery();
//
//            List<Car> cars = new ArrayList<>();
//
//            while (rs.next()) {
//                Car car = new Car();
//                car.setCarId(rs.getInt("carId"));
//                car.setCarName(rs.getString("carName"));
//                cars.add(car);
//            }
//
//            for (Car car : cars) {
//                System.out.println("Id: " + car.getCarId() + ", Name: " + car.getCarName());
//            }
//            conn.close();
        	
        	
//        	carDao
		    System.out.println("\nUsing CarDao\n");
        	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			CarDao carDao = context.getBean("carDao", CarDao.class);
			
			List<Car> cars1 = carDao.getAllCars();
			for(Car car : cars1) {
				System.out.println(car);
			}
			
			Car car1 = carDao.findByCarId(123);
			if (car1 != null) {
			    System.out.println("Car: " + car1);
			} else {
			    System.out.println("Invalid input");
			}
			
//			carService
		    System.out.println("\nUsing CarService\n");
			CarService carService = context.getBean("carService", CarService.class);
			
			List<Car> cars2 = carService.getAllCars();
			for(Car car : cars2)
			{
				System.out.println(car);
			}
			
			Car car2 = carService.findByIdService(123);
			if (car2 != null) {
			    System.out.println("Car: " + car2);
			} else {
			    System.out.println("Invalid input");
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
