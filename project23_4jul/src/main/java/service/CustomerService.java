package service;

import java.sql.SQLException;
import java.util.*;

import model.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers() throws SQLException;

	Customer createCustomer(Customer customer) throws SQLException;
//	public Customer findCustomerById(int id) throws SQLException;
	public Customer findCustomerByName(String name) throws SQLException;
//	public Customer updateCustomer(int id, String new_name, String email) throws SQLException;
	public Customer deleteCustomer(int id) throws SQLException;


}
