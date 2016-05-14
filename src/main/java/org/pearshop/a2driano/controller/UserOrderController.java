package org.pearshop.a2driano.controller;

import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;


/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Controller
public class UserOrderController {
    @Autowired
    private UserOrderService userOrderService;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ModelAndView returnOrder(UserOrderDTO userOrderDTO) {
        ModelAndView modelAndView = new ModelAndView("order");
        modelAndView.addObject("data", userOrderDTO);
        return modelAndView;
    }


    @RequestMapping(value = "/addOrder", method = RequestMethod.POST, headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UserOrderDTO addOrder(@RequestBody UserOrderDTO userOrderDTO){
        userOrderService.addUserOrder(userOrderDTO);
        return new UserOrderDTO();
    }


    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public void updateOrder(UserOrderDTO userOrderDTO) {
        userOrderService.updateUserOrder(userOrderDTO);
    }
}
