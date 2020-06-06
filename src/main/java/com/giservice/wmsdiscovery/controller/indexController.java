package com.giservice.wmsdiscovery.controller;

import com.giservice.wmsdiscovery.mapper.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @Autowired
    test test;

    @GetMapping("/")
    public String index(Model model){
        int age= test.test();
        model.addAttribute("age",age);
        return "index";
    }
}
