package org.example;

import org.example.model.Car;
import org.example.model.MotorCycle;
import org.example.model.RoadVehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(RoadVehicle.class).addAnnotatedClass(Car.class)
					.addAnnotatedClass(MotorCycle.class).buildSessionFactory();
			Session s = sf.openSession();
			
			s.getTransaction().begin(); s.save(new RoadVehicle());
			s.getTransaction().commit(); 
			s.getTransaction().begin();
			s.save(new Car());
			s.save(new MotorCycle());
			s.getTransaction().commit();
			System.out.println("Successful");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
