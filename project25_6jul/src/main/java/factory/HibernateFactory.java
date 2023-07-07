package factory;

import model.Inventory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).buildSessionFactory();
		return sf;
	}

}
