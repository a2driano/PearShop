package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
@Repository
public interface ProductRepository {
    List<Product> getAllproduct();

}
