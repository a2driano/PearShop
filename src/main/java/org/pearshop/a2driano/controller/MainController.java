package org.pearshop.a2driano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 21.04.2016
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView start() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "test---test");
        return modelAndView;
    }
}
