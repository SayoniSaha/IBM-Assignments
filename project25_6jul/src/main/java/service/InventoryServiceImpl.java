package service;

import java.util.*;

import javax.persistence.TypedQuery;

import model.Inventory;
import factory.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InventoryServiceImpl implements InventoryService {
	private SessionFactory sf;
	private Session s = null;
	{
		sf = HibernateFactory.getSessionFactory();

	}

	@Override
	public Inventory createInventory(Inventory inventory) {
		s = sf.openSession();
		s.getTransaction().begin();
		s.save(inventory);
		s.getTransaction().commit();
		return inventory;
	}

	@Override
	public List<Inventory> getAllInventory() {
		s = sf.openSession();
		TypedQuery<Inventory> query = s.createQuery("FROM inventory I", Inventory.class);
		List<Inventory> list = query.getResultList();
		return list;
	}

	@Override
	public Inventory getInventoryByid(int inventoryId) {
		s = sf.openSession();
		Inventory i= s.find(Inventory.class, inventoryId);
		return i;
	}

	@Override
	public List<Inventory> getInventoryByProductName(String productName) {
		s = sf.openSession();
		TypedQuery<Inventory> query = s.createQuery("FROM inventory I where I.product_name=:pName", Inventory.class);
		query.setParameter("pName", productName);
		return query.getResultList();
	}

	@Override
	public Inventory updateInventoryById(int inventoryId,Inventory inventory) {
		s = sf.openSession();
		s.getTransaction().begin();
		Inventory i = s.get(Inventory.class, inventoryId);
		s.getTransaction().commit();
		if(i==null) {
			System.out.println("Invalid input");
			return null;
		}
		else {
			i.setQuantity(inventory.getQuantity());
			i.setProduct_id(inventory.getProduct_id());
			i.setProduct_name(inventory.getProduct_name());
			s.getTransaction().begin();
			s.merge(i);
			s.getTransaction().commit();
			return i;	
		}	
	}

	@Override
	public void deleteInventory(int iventoryId) {
		s = sf.openSession();
		s.getTransaction().begin();
		Inventory i = s.get(Inventory.class, iventoryId);
		s.getTransaction().commit();
		if(i==null) {
			System.out.println("Invalid input");
			
		}
		else {
			s.getTransaction().begin();
			s.remove(i);
			s.getTransaction().commit();
			System.out.println("Successful");
		}
	}
}
