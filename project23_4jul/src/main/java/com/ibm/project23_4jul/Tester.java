package com.ibm.project23_4jul;

//import java.sql.*;
//import java.util.List;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class Tester {
	public static void main(String[] args) {		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			Statement stmt = conn.createStatement();
			ResultSet rs2 = stmt.executeQuery("Select * from customers");
			while(rs2.next())
			{
				System.out.println(rs2.getInt("id") + "," + rs2.getString("name") + "," + rs2.getString("email"));
			}
			conn.close();
			
//			CustomerService cs = new CustomerServiceImpl();
//			Customer c1= cs.createCustomer(new Customer(3, "gh jk", "gh@email.com"));
//			System.out.println(c1);
//			List<Customer> l = cs.getAllCustomers();
//			for(Customer x : l) {
//				System.out.println(x);
//			}
//			CustomerService cs = new CustomerServiceImpl();
//			Customer c = cs.findCustomerById(10);
//			
//			if(c == null) {
//				System.out.println("No such customer");
//			}
//			else {
//				System.out.println("Customer: " + c);
//			}
			
			CustomerService cs = new CustomerServiceImpl();
			Customer c1 = cs.findCustomerByName("qw er");
			
			if(c1 == null) {
				System.out.println("No such customer");
			}
			else {
				System.out.println(c1);
			}
			
//			CustomerService cs = new CustomerServiceImpl();
//			Customer c2 = cs.updateCustomer(1,"zx cv","zx@email.com");
//			
//			if(c2 == null) {
//				System.out.println("No such customer");
//			}
//			else {
//				System.out.println("Updated-\n" + c2);
//			}
			
			Customer c2 = cs.deleteCustomer(10);
			
			if(c2 == null) {
				System.out.println("No such customer");
			}
			else {
				System.out.println("Deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
