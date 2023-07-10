package org.pro.project29_10jul;

import java.util.*;

import model.Address;
import model.Company;
import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        try {
        	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
        			addAnnotatedClass(Company.class).buildSessionFactory();
        	Session session = sf.openSession();
//			Employee employee1 = new Employee(new Random().nextInt(10000), "ab", "cd", "ab@email.com");
//			Employee employee2 = new Employee(new Random().nextInt(10000), "ef", "gh", "ef@email.com");
//			Employee employee3 = new Employee(new Random().nextInt(10000), "ij", "kl", "ij@email.com");
//			Company com = new Company(); ArrayList<Employee> list=new
//			ArrayList<Employee>(); list.add(employee1); list.add(employee2);
//			list.add(employee3); com.setCompanyId(UUID.randomUUID().toString());
//			com.setCompanyName("company3"); com.setCompanyAddress(new Address("Kolkata", "Bengal", "Kolkata", "700000"));
//			com.setEmployees(list);
			session.getTransaction().begin();
			//session.save(com);
			
//			Create company
//			Company c=session.get(Company.class, "43908bf6-6a82-4c96-8e1e-a74920c89d87");
//			System.out.println(c);
//			session.remove(c);
//			session.getTransaction().commit();
//			System.out.println("Created");
			
			
			Employee employee1 = new Employee();
			employee1.setEmployeeId(12);
			employee1.setFirstName("wx");
			employee1.setLastName("yz");
			employee1.setEmail("wx@email.com");
		    Employee employee2=new Employee();
		    employee2.setEmployeeId(21);
		    employee2.setFirstName("jk");
		    employee2.setLastName("lm");
		    employee2.setEmail("jk@email.com");
		    Company company3 = new Company();
		
			company3.setCompanyId(UUID.randomUUID().toString());
			company3.setCompanyName("IBM");
			company3.setCompanyAddress(new Address("Kolkata", "Bengal", "Kolkata", "700000"));
			employee1.setCompany(company3);
			employee2.setCompany(company3);
			session.getTransaction().begin();
			
			session.save(employee1);
			session.getTransaction().commit();
			session.getTransaction().begin();
			session.save(employee2);
			session.getTransaction().commit();
			System.out.println("Created");
			
			
//			Find by Id
			Company company1 = session.find(Company.class, "43908bf6-6a82-4c96-8e1e-a74920c89d87");
            System.out.println(company1);

            session.getTransaction().commit();

            System.out.println("Retrieved");
            
//            Delete by Id
            Company company2 = session.find(Company.class, "43908bf6-6a82-4c96-8e1e-a74920c89d87");
            if (company2 != null) {
                session.delete(company2);
                System.out.println("Company deleted");
            } else {
                System.out.println("Invalid input");
            }

            session.getTransaction().commit();

            System.out.println("Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
