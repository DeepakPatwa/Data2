package com.stackroute.controller;

import com.stackroute.dao.UserDao;
import com.stackroute.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    UserDao userDao;

    public LoginController(UserDao userDao) {
        this.userDao = userDao;
    }


    @RequestMapping(value = "/")
    public String greeting(ModelMap map){

        return "Login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String greeting1(ModelMap map, @RequestParam("username")String userName, @RequestParam("password") String userPassword){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(userPassword);
            userDao.saveUser(user);
            map.addAttribute("userdetails", user);

        return "index";
    }
}
