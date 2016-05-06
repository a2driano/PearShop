package org.pearshop.a2driano.util;

import org.pearshop.a2driano.model.entity.Product;
import org.pearshop.a2driano.model.entity.UserOrder;
import org.pearshop.a2driano.model.web.ProductDTO;
import org.pearshop.a2driano.model.web.UserOrderDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
public class ApplicationUtil {
    public static ProductDTO convertProductToProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setArticle(product.getArticle());
        productDTO.setCategory(product.getCategory());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setScreen(product.getScreen());
        productDTO.setMemory(product.getMemory());
        productDTO.setCommunicator(product.getCommunicator());
        productDTO.setColor(product.getColor());
        productDTO.setCamera(product.getCamera());
        productDTO.setPrice(product.getPrice());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setCount(product.getCount());
        return productDTO;
    }

    public static List<ProductDTO> convertProductListToProductDTOList(List<Product> productList) {
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
        for (Product product : productList) {
            productDTOList.add(convertProductToProductDTO(product));
        }
        return productDTOList;
    }

    public static UserOrder convertUserOrderDTOToUserOrder(UserOrderDTO userOrderDTO) {
        UserOrder userOrder = new UserOrder();
        userOrder.setId(userOrderDTO.getId());
        userOrder.setFirstname(userOrderDTO.getFirstname());
        userOrder.setLastname(userOrderDTO.getLastname());
        userOrder.setEmail(userOrderDTO.getEmail());
        userOrder.setPhone(userOrderDTO.getPhone());
        userOrder.setDescription(userOrderDTO.getDescription());
        userOrder.setDate(userOrderDTO.getDate());
        userOrder.setStatus(userOrderDTO.getStatus());
        userOrder.setProduct(userOrderDTO.getProduct());

        return userOrder;
    }

    public static UserOrderDTO convertUserOrderToUserOrderDTO(UserOrder userOrder) {
        UserOrderDTO userOrderDTO = new UserOrderDTO();
        userOrderDTO.setId(userOrder.getId());
        userOrderDTO.setFirstname(userOrder.getFirstname());
        userOrderDTO.setLastname(userOrder.getLastname());
        userOrderDTO.setEmail(userOrder.getEmail());
        userOrderDTO.setPhone(userOrder.getPhone());
        userOrderDTO.setDescription(userOrder.getDescription());
        userOrderDTO.setDate(userOrder.getDate());
        userOrderDTO.setStatus(userOrder.getStatus());
        userOrderDTO.setProduct(userOrder.getProduct());

        return userOrderDTO;
    }

    public static List<UserOrderDTO> convertUserOrderListToUserOrderDTOList(List<UserOrder> userOrderList) {
        List<UserOrderDTO> userOrderDTOList = new ArrayList<>();
        for (UserOrder userOrder : userOrderList) {
            userOrderDTOList.add(convertUserOrderToUserOrderDTO(userOrder));
        }
        return userOrderDTOList;
    }

}
