package org.pearshop.a2driano.controller;

import org.pearshop.a2driano.model.Status;
import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.service.CountProductService;
import org.pearshop.a2driano.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Controller
public class AdminCotroller {
    @Autowired
    private UserOrderService userOrderService;
    @Autowired
    private CountProductService countProductService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView getAllUserOrders() {
        return new ModelAndView("admin").addObject("countProductList", countProductService.getAllCountProduct());
    }

    @RequestMapping(value = "/admin/update", method = RequestMethod.POST)
    @ResponseBody
    public UserOrderDTO updateUserOrder(@RequestBody UserOrderDTO userOrderDTO) {
        userOrderService.updateUserOrder(userOrderDTO.getId(), userOrderDTO.getStatus());
        return new UserOrderDTO();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }


}
