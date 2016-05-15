package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.entity.CountProduct;
import org.pearshop.a2driano.model.web.CountProductDTO;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 15.05.2016
 */
public interface CountProductService {
    List<CountProductDTO> getAllCountProduct();
    CountProduct getCountProduct(Integer id);
}
