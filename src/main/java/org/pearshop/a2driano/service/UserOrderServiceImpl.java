package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.repositories.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.pearshop.a2driano.util.ApplicationUtil.convertUserOrderDTOToUserOrder;
import static org.pearshop.a2driano.util.ApplicationUtil.convertUserOrderListToUserOrderDTOList;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Service
public class UserOrderServiceImpl implements UserOrderService {
    @Autowired
    private UserOrderRepository userOrderRepository;

    @Override
    public List<UserOrderDTO> getUserOrderList() {
        List<UserOrderDTO> userOrderDTOList = new ArrayList<>();
        try {
            userOrderDTOList = convertUserOrderListToUserOrderDTOList(userOrderRepository.getAllUserOrder());
        } catch (Exception e) {
            System.err.println(e);
        }
        return userOrderDTOList;
    }

    @Override
    public void addUserOrder(UserOrderDTO userOrderDTO) {
        try {
            userOrderRepository.addUserOrder(convertUserOrderDTOToUserOrder(userOrderDTO));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void updateUserOrder(UserOrderDTO userOrderDTO) {
        try {
            userOrderRepository.updateUserOrder(convertUserOrderDTOToUserOrder(userOrderDTO));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
