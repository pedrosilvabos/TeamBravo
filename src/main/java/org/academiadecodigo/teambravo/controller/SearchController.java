package org.academiadecodigo.teambravo.controller;

import org.academiadecodigo.teambravo.persistence.model.User;
import org.academiadecodigo.teambravo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class SearchController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/customer/search/{id}"})
    public String showSkilledUsers(@PathVariable Integer id, Model model) {

        List<User> list = userService.getUsersBySkill(userService.getSkillById(id));
        model.addAttribute("userList", list);

        return "customer/search";
    }
}
