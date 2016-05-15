package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.CountProductDTO;
import org.pearshop.a2driano.repositories.CountProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.pearshop.a2driano.util.ApplicationUtil.convertCountProductListToCountProductDTOList;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 15.05.2016
 */
@Service
public class CountProductServiceImpl implements CountProductService {
    @Autowired
    private CountProductRepository countProductRepository;

    @Override
    public List<CountProductDTO> getAllCountProduct() {
        List<CountProductDTO> countProductDTOList = new ArrayList<>();
        try {
            countProductDTOList = convertCountProductListToCountProductDTOList(countProductRepository.getAllCountProducts());
        } catch (Exception e) {
            System.err.println(e);
        }
        return countProductDTOList;
    }
}
