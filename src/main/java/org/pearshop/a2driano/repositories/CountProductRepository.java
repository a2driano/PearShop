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
    List<CountProduct> getAllCountProducts();

    void addCountProduct(CountProduct countProduct);
}
