package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String greeting(Model map)
    {
        map.addAttribute("greeting", "welcome to stackroute!!");
        return "index";
    }
}
