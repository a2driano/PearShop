package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.CountProduct;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 15.05.2016
 */
public interface CountProductRepository {
    /**
     * return List of CountProduct
     * @return
     */
    List<CountProduct> getAllCountProducts();

    /**
     * Add new CountProduct in DB
     * @param countProduct
     */
    void addCountProduct(CountProduct countProduct);

    /**
     * Return CountProduct by id
     * @param id
     * @return
     */
    CountProduct getCountProductById(Integer id);
}
