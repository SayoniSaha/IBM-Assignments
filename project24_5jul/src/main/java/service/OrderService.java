package service;

import java.sql.Connection;

import model.Inventory;
import model.Order;

public interface OrderService {
	
	boolean searchInventory(Connection conn, int i_id) throws Exception;
	void addOrder(Connection conn, Order order) throws Exception ;
}
