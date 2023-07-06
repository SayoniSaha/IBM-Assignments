package service;

import java.sql.*;
import java.util.*;

import factory.MyConnectionFactory;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private MyConnectionFactory cf = null;
	private List<Customer> customers;
	private Connection conn = null;
	
	{
		try {
			customers=new ArrayList<Customer>();
			cf = MyConnectionFactory.getMyFactory();
			conn = cf.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("Select * from customers");
		while(resultSet.next()) {
			customers.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
		}
		return customers;
	}
	
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {

		PreparedStatement pstmt = conn.prepareStatement("Insert into customers(id,name,email) values(?,?,?)");
		pstmt.setInt(1, customer.getId());
		pstmt.setString(2, customer.getName());
		pstmt.setString(3, customer.getEmail());
		int res = pstmt.executeUpdate();
		System.out.println(res + " row(s) inserted");

		return customer;
	}
	
//	@Override
//	public Customer findCustomerById(int id) throws SQLException {
//		PreparedStatement pstmt = null;
//		pstmt = conn.prepareStatement("Select * from customers where id=?");
//		pstmt.setInt(1, id);
//		ResultSet rs= pstmt.executeQuery();
//		while(rs.next()) {
//			customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
//		}
//		if(customers.isEmpty())	{
//			return null;
//		}
//		else {
//			return customers.get(0);
//		}
//		
//	}
	
	@Override
	public Customer findCustomerByName(String name) throws SQLException {
		PreparedStatement pstmt = null;
		pstmt = conn.prepareStatement("Select * from customers where name=?");
		pstmt.setString(1, name);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		if(customers.isEmpty())	{
			return null;
		}
		else {
			return customers.get(0);
		}	
	}
	
//	@Override
//	public Customer updateCustomer(int id, String new_name, String new_email) throws SQLException {
//		PreparedStatement pstmt = null;
//	    pstmt = conn.prepareStatement("Update customers SET name=?, email=? WHERE id=?");
//	    pstmt.setString(1, new_name);
//	    pstmt.setString(2, new_email);
//	    pstmt.setInt(3, id);
//	    
//	    int res = pstmt.executeUpdate();
//	    
//	    if (res > 0) {
//	        pstmt = conn.prepareStatement("Select * from customers where name=?");
//	        pstmt.setString(1, new_name);
//	        ResultSet rs = pstmt.executeQuery();
//	        
//	        if (rs.next()) {
//	            return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
//	        }
//	    }
//	    
//	    return null;
//	}
	
	@Override
	public Customer deleteCustomer(int id) throws SQLException {
		PreparedStatement pstmt = null;
	    pstmt = conn.prepareStatement("Delete from customers where id=?");
	    pstmt.setInt(1, id);
	    
	    int res = pstmt.executeUpdate();
	    
	    if (res > 0) {
	        pstmt = conn.prepareStatement("Select * from customers where id=?");
	        pstmt.setInt(1, id);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
	        }
	    }
	    
	    return null;
	}
}
