package service;

import java.util.*;

import model.Inventory;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();
	
	public Inventory getInventoryByid(int inventoryId);
	
	public List<Inventory> getInventoryByProductName(String product_name);
	
	public Inventory updateInventoryById(int i_id,Inventory inventory);
	
	public void deleteInventory(int i_id);

}
