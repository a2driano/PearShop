package org.pearshop.a2driano.util;

import org.pearshop.a2driano.model.entity.CountProduct;
import org.pearshop.a2driano.model.entity.Product;
import org.pearshop.a2driano.model.entity.UserOrder;
import org.pearshop.a2driano.model.web.CountProductDTO;
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
        userOrder.setCountProductList(userOrderDTO.getCountProductList());

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
        userOrderDTO.setCountProductList(userOrder.getCountProductList());

        return userOrderDTO;
    }

    public static List<UserOrderDTO> convertUserOrderListToUserOrderDTOList(List<UserOrder> userOrderList) {
        List<UserOrderDTO> userOrderDTOList = new ArrayList<>();
        for (UserOrder userOrder : userOrderList) {
            userOrderDTOList.add(convertUserOrderToUserOrderDTO(userOrder));
        }

        return userOrderDTOList;
    }

    public static CountProduct convertCountProductDTOToCountProduct(CountProductDTO countProductDTO) {
        CountProduct countProduct = new CountProduct();
        countProduct.setId(countProductDTO.getId());
        countProduct.setCount(countProductDTO.getCount());
        countProduct.setSumCount(countProductDTO.getSumCount());
        countProduct.setProduct(countProductDTO.getProduct());
        countProduct.setUserOrder(countProductDTO.getUserOrder());

        return countProduct;
    }

    public static List<CountProduct> convertCountProductDTOListToCountProductList(List<CountProductDTO> countProductDTOList){
        List<CountProduct> countProductList=new ArrayList<>();
        for(CountProductDTO countProductDTO: countProductDTOList){
            countProductList.add(convertCountProductDTOToCountProduct(countProductDTO));
        }
        return countProductList;
    }

    public static CountProductDTO convertCountProductToCountProductDTO(CountProduct countProduct) {
        CountProductDTO countProductDTO = new CountProductDTO();
        countProductDTO.setId(countProduct.getId());
        countProductDTO.setCount(countProduct.getCount());
        countProductDTO.setSumCount(countProduct.getSumCount());
        countProductDTO.setProduct(countProduct.getProduct());
        countProductDTO.setUserOrder(countProduct.getUserOrder());

        return countProductDTO;
    }

    public static List<CountProductDTO> convertCountProductListToCountProductDTOList(List<CountProduct> countProductList){
        List<CountProductDTO> countProductDTOList=new ArrayList<>();
        for(CountProduct countProduct: countProductList){
            countProductDTOList.add(convertCountProductToCountProductDTO(countProduct));
        }
        return countProductDTOList;
    }

}
