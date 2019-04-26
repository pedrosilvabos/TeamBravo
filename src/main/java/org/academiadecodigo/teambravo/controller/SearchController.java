package org.academiadecodigo.teambravo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class SearchController {
    @RequestMapping(method = RequestMethod.GET, path = {"/search"})
    public String showSkilledUsers() {
        return "customer/search";
    }
}
