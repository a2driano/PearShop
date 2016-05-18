package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.UserOrder;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
public interface UserOrderRepository {
    /**
     * Return List of UserOrders
     *
     * @return
     */
    List<UserOrder> getAllUserOrder();

    /**
     * Return current UserOrder by id
     *
     * @param id
     * @return
     */
    UserOrder getUserOrderById(Integer id);

    /**
     * Add new UserOrder and return current entity
     *
     * @param userOrder
     * @return
     */
    UserOrder addUserOrder(UserOrder userOrder);

    /**
     * Update UserOrder
     *
     * @param userOrder
     */
    void updateUserOrder(UserOrder userOrder);
}
