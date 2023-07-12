package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import factory.ProductFactory;
import entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	private final ProductFactory productFactory;

    @Autowired
    public ProductDaoImpl(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @Override
    public Product createProduct(Product product) throws SQLException {
        try (Connection connection = productFactory.getMyConnection();
             PreparedStatement pStatement = connection.prepareStatement("INSERT INTO product VALUES (?, ?)")) {
            pStatement.setString(1, product.getProductId());
            pStatement.setString(2, product.getProductName());
            pStatement.executeUpdate();
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        List<Product> list = new ArrayList<>();
        try (Connection connection = productFactory.getMyConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM product")) {
            while (resultSet.next()) {
                list.add(new Product(resultSet.getString(1), resultSet.getString(2)));
            }
        }
        return list;
    }

    @Override
    public Product findById(String productId) throws SQLException {
        try (Connection connection = productFactory.getMyConnection();
             PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM product WHERE productId = ?")) {
            pStatement.setString(1, productId);
            try (ResultSet resultSet = pStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new Product(resultSet.getString(1), resultSet.getString(2));
                }
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        try (Connection connection = productFactory.getMyConnection();
             PreparedStatement pStatement = connection.prepareStatement("UPDATE product SET productName = ? WHERE productId = ?")) {
            pStatement.setString(1, product.getProductName());
            pStatement.setString(2, product.getProductId());
            pStatement.executeUpdate();
        }
    }

    @Override
    public void deleteById(String productId) throws SQLException {
        try (Connection connection = productFactory.getMyConnection();
             PreparedStatement pStatement = connection.prepareStatement("DELETE FROM product WHERE productId = ?")) {
            pStatement.setString(1, productId);
            pStatement.executeUpdate();
        }
    }
}
