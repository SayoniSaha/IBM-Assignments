package org.pro.project27_7jul;

import java.util.*;

import model.Order;
import model.Shipment;
import model.SpecialEditionCD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
    	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Order.class).addAnnotatedClass(Shipment.class).buildSessionFactory();
		Session s = sf.openSession();
		Shipment shipment = new Shipment();
		shipment.setCity("Kolkata");
		shipment.setPincode("700000");
		shipment.setId(new Random().nextInt(100));
		Order o = new Order();
		o.setId("1");
		o.setOrderName("PC");
		o.setShipment(shipment);
		
		s.getTransaction().begin();
		s.save(shipment);
		s.save(o);

		Order o2 = s.get(Order.class, "1");
		s.remove(o2);
		s.getTransaction().commit();
		System.out.println("Successful");
    }
}

