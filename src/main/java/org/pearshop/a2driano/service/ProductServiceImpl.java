package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.ProductDTO;
import org.pearshop.a2driano.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.pearshop.a2driano.util.ApplicationUtil.convertProductListToProductDTOList;

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
        return convertProductListToProductDTOList(productRepository.getAllproduct());
    }
}
