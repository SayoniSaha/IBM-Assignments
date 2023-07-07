package org.example;

import java.util.*;

//import factory.HibernateFactory;
//import model.Inventory;
//import model.Product;
import service.InventoryService;
import service.InventoryServiceImpl;
//import org.hibernate.Session;
//import com.mysql.cj.xdevapi.SessionFactory;

public class App {
	public static void main(String[] args) {
		try {

			InventoryService s = new InventoryServiceImpl();
			/*
			 * Inventory i=service.createInventory(new Inventory(301, 101, "Laptop", 10));
			 * System.out.println(i);
			 */

			/*
			 * List<Inventory> i=service.getAllInventory(); for(Inventory ii:i) {
			 * System.out.println(i); }
			 */

			/*
			 * Inventory i=service.getInventoryByid(100); if(i==null) {
			 * System.out.println("no such id found..."); } else { System.out.println(i); }
			 * 
			 * String productName="Pen"; List<Inventory> list =
			 * s.getInventoryByProductName(productName); if (!list.isEmpty()) {
			 * 
			 * org.hibernate.SessionFactory
			 * sessionFactory=MyHibernateFactory.getSessionFactory(); Session
			 * session=sessionFactory.openSession(); session.getTransaction().begin();
			 * session.save(new Product(100, productName, 10));
			 * session.getTransaction().commit(); } else { System.out.
			 * println("no product found in inventory try again after some time..."); }
			 */
			
			/*
			 * Inventory i=service.updateInventoryById(301, new
			 * Inventory(103,"Hp Desktop",190)); System.out.println(i);
			 * 
			 * if(i==null) { System.out.println("unable to update..."); } else {
			 * System.out.println("Successful-"+i); }
			 */
			
			s.deleteInventory(301);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}