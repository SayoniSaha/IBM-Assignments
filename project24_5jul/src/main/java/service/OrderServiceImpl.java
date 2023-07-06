package service;


//import java.sql.*;

//import com.mysql.cj.jdbc.Driver;

import model.Order;
import model.Inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderServiceImpl implements OrderService {
	@Override
	public boolean searchInventory(Connection conn, int i_id) throws Exception {
        PreparedStatement pstmt = conn.prepareStatement("select * from inventory where i_id = ?");
        pstmt.setInt(1, i_id);
        ResultSet rs = pstmt.executeQuery();
        boolean exists = rs.next();
        rs.close();
        pstmt.close();
        return exists;
    }

    @Override
    public void addOrder(Connection conn, Order order) throws Exception {
        PreparedStatement pstmt = conn.prepareStatement("insert into orders (o_id, product, price) values(?, ?, ?)");
        pstmt.setInt(1, order.getO_id());
        pstmt.setString(2, order.getProduct_name());
        pstmt.setDouble(3, order.getPrice());
        pstmt.executeUpdate();
        pstmt.close();
    }

}