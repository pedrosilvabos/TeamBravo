package org.academiadecodigo.teambravo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    @RequestMapping("/")
    public String listSkills() {
        return "customer/index";
    }


}

