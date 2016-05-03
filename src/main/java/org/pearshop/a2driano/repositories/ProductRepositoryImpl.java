package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAllproduct() {
        return entityManager.createNamedQuery("GetAllProducts").getResultList();
    }
}
