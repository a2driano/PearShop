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
    /**
     * Return List of all product in DB
     *
     * @return
     */
    List<Product> getAllProduct();

    /**
     * Return current catgory Products
     *
     * @param category
     * @return
     */
    List<Product> getAllProductByCategory(Category category);

    /**
     * Return Product by id
     *
     * @param id
     * @return
     */
    Product getProductById(Integer id);

    /**
     * update product
     *
     * @param product
     */
    void updateProduct(Product product);
}
