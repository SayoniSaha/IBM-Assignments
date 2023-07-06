package com.ibm.project24_5jul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

import model.Order;
import model.Inventory;
import service.OrderService;
import service.OrderServiceImpl;

public class Tester {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/orders";
            String user = "root";
            String pass = "root";
            Connection conn = DriverManager.getConnection(url, user, pass);

            int i_id = 1;

            OrderService orderService = new OrderServiceImpl();
            if (orderService.searchInventory(conn, i_id)) {
    			Statement stmt = conn.createStatement();
                Inventory inventory = fetchData(conn, i_id);
                Order order = createOrder(inventory);
                orderService.addOrder(conn, order);
                System.out.println("Order added successfully: " + order);
                ResultSet rs2 = stmt.executeQuery("select * from orders");
                while(rs2.next()) {
                	System.out.println(rs2.getInt("o_id") + "," + rs2.getString("product") + "," + rs2.getDouble("price"));
                }
            } else {
                System.out.println("Inventory item does not exist for i_id: " + i_id);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Inventory fetchData(Connection conn, int i_id) throws Exception {
        PreparedStatement pstmt = conn.prepareStatement("select * from inventory where i_id = ?");
        pstmt.setInt(1, i_id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int product_id = rs.getInt("product_id");
            String product_name = rs.getString("product_name");
            double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            return new Inventory(i_id, product_id, product_name, price, quantity);
        }
        rs.close();
        pstmt.close();
        return null;
    }

    private static Order createOrder(Inventory inventory) {
        int i_id = inventory.getProduct_id();
        String product_name = inventory.getProduct_name();
        double price = inventory.getPrice();
        return new Order(i_id, product_name, price);
    }

}