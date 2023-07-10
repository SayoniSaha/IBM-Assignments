package org.pro.project28_7jul;

import java.util.*;

import model.Employee;
import model.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
		Session session = sf.openSession();
		Department department = new Department();
		department.setDepartment("xyz");
		department.setLocation("Kolkata");
		department.setDept_id(new Random().nextInt(1000));
		Employee emp = new Employee();
		emp.setEmpid("100");
		emp.setEmpName("abc");
		emp.setSalary("1000");
		emp.setDept(department);
		session.getTransaction().begin();
		session.save(department);
		session.save(emp);

		Employee emp2 = session.get(Employee.class, "100");
		session.remove(emp2);
		session.getTransaction().commit();
		System.out.println("Successful");
	}
}
