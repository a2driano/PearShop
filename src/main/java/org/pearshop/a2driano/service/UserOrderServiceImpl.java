package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.entity.CountProduct;
import org.pearshop.a2driano.model.entity.UserOrder;
import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.repositories.CountProductRepository;
import org.pearshop.a2driano.repositories.ProductRepository;
import org.pearshop.a2driano.repositories.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Transactional
public class UserOrderServiceImpl implements UserOrderService {
    @Autowired
    private UserOrderRepository userOrderRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CountProductRepository countProductRepository;

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
            //set Count product
            CountProduct countProduct = new CountProduct();
            countProduct.setProduct(productRepository.getProductById(userOrderDTO.getIdProduct()));
            countProduct.setCount(userOrderDTO.getCount());
            countProduct.setSumCount(countProduct.getProduct().getPrice() * userOrderDTO.getCount());
            countProduct.setUserOrder(userOrderRepository.addUserOrder(convertUserOrderDTOToUserOrder(userOrderDTO)));
            countProductRepository.addCountProduct(countProduct);
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
