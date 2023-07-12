package service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.ProductDao;
import entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product createProduct(Product product) throws SQLException {
        return productDao.createProduct(product);
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productDao.getAllProducts();
    }

    @Override
    public Product findById(String productId) throws SQLException {
        List<Product> products = productDao.getAllProducts();
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productDao.updateProduct(product);
    }

    @Override
    public void deleteById(String productId) throws SQLException {
        productDao.deleteById(productId);
    }

}
