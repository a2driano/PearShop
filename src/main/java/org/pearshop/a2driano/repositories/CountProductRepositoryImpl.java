package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.CountProduct;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 15.05.2016
 */
@Repository
public class CountProductRepositoryImpl implements CountProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CountProduct> getAllCountProducts() {
        return entityManager.createNamedQuery("GetAllCountProduct").getResultList();
    }

    @Override
    public void addCountProduct(CountProduct countProduct) {
        entityManager.persist(countProduct);
    }

}
