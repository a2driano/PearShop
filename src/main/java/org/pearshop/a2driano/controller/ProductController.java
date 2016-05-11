package org.pearshop.a2driano.controller;

import org.pearshop.a2driano.model.Category;
import org.pearshop.a2driano.model.web.ProductDTO;
import org.pearshop.a2driano.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{category}", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductDTO> getAllProductByCategory(@PathVariable("category") Category category) {
        return productService.getAllByCategory(category);
    }

    @RequestMapping(value = "/{category}/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ProductDTO getProductByArticle(@PathVariable("category") Category category,
                                          @PathVariable("id") Integer id) {
        return productService.getProductByArticle(id);
    }
}
