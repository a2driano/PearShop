package org.pearshop.a2driano.controller;

import org.pearshop.a2driano.model.web.JsonResponse;
import org.pearshop.a2driano.model.web.UserOrderDTO;
import org.pearshop.a2driano.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


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

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse addOrder(@RequestBody @Valid UserOrderDTO userOrderDTO, BindingResult result) {
        JsonResponse res = new JsonResponse();
        if (!result.hasErrors()) {
            res.setStatus("SUCCESS");
            userOrderService.addUserOrder(userOrderDTO);
        } else {
            res.setStatus("FAIL");
            res.setResult(result.getAllErrors());
        }
        return res;
    }
}
