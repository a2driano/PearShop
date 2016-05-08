package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.web.ProductDTO;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
public interface ProductService {
    /**
     * Return all products
     *
     * @return list ProductDTO
     */
    List<ProductDTO> getAll();

    /**
     * Return products by category
     *
     * @return list ProductDTO
     */
    List<ProductDTO> getAllByCategory(Category category);

    /**
     * Return product by article
     *
     * @param article
     * @return
     */
    ProductDTO getProductByArticle(Integer article);

    void updateProduct(ProductDTO productDTO);
}
