package org.academiadecodigo.teambravo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class RegisterController {
    @RequestMapping(method = RequestMethod.GET, path = {"/register"})
    public String validate() {
        return "customer/register";
    }
}
