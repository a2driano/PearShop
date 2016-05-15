package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.UserOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
public interface UserOrderRepository {
    List<UserOrder> getAllUserOrder();

    UserOrder getUserOrderById(Integer id);

    UserOrder addUserOrder(UserOrder userOrder);

    void updateUserOrder(UserOrder userOrder);
}
