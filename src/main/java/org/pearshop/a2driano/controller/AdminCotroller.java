package org.pearshop.a2driano.controller;

import org.pearshop.a2driano.model.entity.CountProduct;
import org.pearshop.a2driano.model.entity.UserOrder;
import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.service.CountProductService;
import org.pearshop.a2driano.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Controller
public class AdminCotroller {
//    @Autowired
//    private UserOrderService userOrderService;
    @Autowired
    private CountProductService countProductService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView getAllUserOrders() {
        ModelAndView modelAndView = new ModelAndView("admin");
        modelAndView.addObject("countProductList", countProductService.getAllCountProduct());
        System.err.println(countProductService.getAllCountProduct());
        return modelAndView;
    }

//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public ModelAndView getAllUserOrders() {
//        ModelAndView modelAndView = new ModelAndView("admin");
//        modelAndView.addObject("countProductList", userOrderService.getUserOrderList());
//        return modelAndView;
//    }

}
