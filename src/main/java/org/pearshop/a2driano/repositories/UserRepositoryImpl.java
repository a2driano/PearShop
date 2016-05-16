package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User getUserByLogin(String login) {
        return (User)entityManager.createNamedQuery("GetUserByLogin").setParameter("login", login).getSingleResult();
    }
}
