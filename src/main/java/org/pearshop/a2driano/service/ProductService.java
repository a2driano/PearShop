package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.ProductDTO;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 03.05.2016
 */
public interface ProductService {
    List<ProductDTO> getAll();
}
