package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.web.ProductDTO;
import org.pearshop.a2driano.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.pearshop.a2driano.util.ApplicationUtil.convertProductListToProductDTOList;
import static org.pearshop.a2driano.util.ApplicationUtil.convertProductToProductDTO;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAll() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = convertProductListToProductDTOList(productRepository.getAllProduct());
        } catch (Exception e) {
            System.err.println(e);
        }
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getAllByCategory(Category category) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = convertProductListToProductDTOList(productRepository.getAllProductByCategory(category));
        } catch (Exception e) {
            System.err.println(e);
        }
        return productDTOList;
    }

    @Override
    public ProductDTO getProductByArticle(Integer article) {
        ProductDTO productDTO = new ProductDTO();
        try {
            productDTO = convertProductToProductDTO(productRepository.getProductByArticle(article));
        } catch (Exception e) {
            System.err.println(e);
        }
        return productDTO;
    }
}
