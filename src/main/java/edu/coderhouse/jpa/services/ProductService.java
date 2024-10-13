package edu.coderhouse.jpa.services;

import edu.coderhouse.jpa.entities.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProductById(Integer id);
    List<Product> getAllProducts();
    void deleteProduct(Integer id);
}
