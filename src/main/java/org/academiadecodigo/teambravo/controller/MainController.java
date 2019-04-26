package org.academiadecodigo.teambravo.controller;

import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/")
public class MainController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String listSkills(Model model) {

        System.out.println(userService.getAllSkills());
        model.addAttribute("allSkills", userService.getAllSkills());


        return "customer/index";
    }
/*
    @RequestMapping(method = RequestMethod.GET, value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Skill>> listCustomer() {


        return new ResponseEntity<>(userService.getAllSkills(), HttpStatus.OK);
    }
*/

}

