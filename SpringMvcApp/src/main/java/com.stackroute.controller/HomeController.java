package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        User user = new User();
        user.setName("Deepak");
        map.addAttribute("greeting","Welcome " + user.getName() + " to stackroute");

        return "index";
    }
}