package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.UserOrderDTO;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
public interface UserOrderService {

    /**
     * Return all orders in DB
     *
     * @return
     */
    List<UserOrderDTO> getUserOrderList();

    /**
     * Add new order
     *
     * @param userOrderDTO
     */
    void addUserOrder(UserOrderDTO userOrderDTO);

    /**
     * Update order
     *
     * @param userOrderDTO
     */
    void updateUserOrder(UserOrderDTO userOrderDTO);
}
