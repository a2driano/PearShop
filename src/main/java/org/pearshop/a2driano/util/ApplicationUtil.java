package org.pearshop.a2driano.util;

import org.pearshop.a2driano.model.entity.Product;
import org.pearshop.a2driano.model.web.ProductDTO;

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

    public static List<ProductDTO> convertProductToProductDTOList(List<Product> productList) {
        List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
        for (Product product : productList) {
            productDTOList.add(convertProductToProductDTO(product));
        }
        return productDTOList;
    }
}
