package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public ModelAndView home(ModelMap modelMap) {
        return new ModelAndView("index", modelMap);
    }

    @GetMapping(value = "/about")
    public ModelAndView about(ModelMap modelMap) {
        return new ModelAndView("about", modelMap);
    }
}
