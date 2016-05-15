package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.Status;
import org.pearshop.a2driano.model.entity.UserOrder;
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

    UserOrderDTO getUserOrder(Integer id);

    /**
     * Add new order
     *
     * @param userOrderDTO
     */
    void addUserOrder(UserOrderDTO userOrderDTO);

    /**
     * Update order
     *
     * @param id
     * @param status
     */
    void updateUserOrder(Integer id, Status status);
}
