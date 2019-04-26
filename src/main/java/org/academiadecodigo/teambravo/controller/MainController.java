package org.academiadecodigo.teambravo.controller;

import org.academiadecodigo.teambravo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {

    private UserService userService;


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String listSkills(Model model) {

        model.addAttribute(userService.getSkills());

        return "customer/index";
    }


}

