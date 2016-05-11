package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.entity.Product;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
public interface ProductRepository {
    List<Product> getAllProduct();

    List<Product> getAllProductByCategory(Category category);

    Product getProductById(Integer id);

    void updateProduct(Product product);
}
