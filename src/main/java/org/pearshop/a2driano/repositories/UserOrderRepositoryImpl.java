package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.UserOrder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Repository
public class UserOrderRepositoryImpl implements UserOrderRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserOrder> getAllUserOrder() {
        return entityManager.createNamedQuery("GetAllUserOrder").getResultList();
    }

    @Override
    public UserOrder getUserOrderById(Integer id) {
        return (UserOrder) entityManager.createNamedQuery("GetUserOrderById").setParameter("id", id).getSingleResult();
    }

    @Override
    public UserOrder addUserOrder(UserOrder userOrder) {
        entityManager.persist(userOrder);
        entityManager.flush();
        return userOrder;
    }

    @Override
    public void updateUserOrder(UserOrder userOrder) {
        entityManager.merge(userOrder);
    }
}
