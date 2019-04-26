package org.academiadecodigo.teambravo.controller;

import org.academiadecodigo.teambravo.command.UserDto;
import org.academiadecodigo.teambravo.converters.UserDtoToUser;
import org.academiadecodigo.teambravo.converters.UserToUserDto;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.persistence.model.User;
import org.academiadecodigo.teambravo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/")
public class MainController {

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;


    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String listSkills(Model model) {

        System.out.println(userService.getAllSkills());
        model.addAttribute("allSkills", userService.getAllSkills());
        model.addAttribute("allLocations", userService.getAllLocations());


        return "customer/index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/register")
    public String register(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            return "customer/index";
        }
        User savedUser = userService.saveUser(userDtoToUser.convert(userDto));

        return "customer/profile";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login(Model model) {

        return "customer/profile";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public String search(Model model, @RequestParam("skills") String skills, @RequestParam("location") String location) {

        Skill skill1 =null;


        for (Skill skill : userService.getAllSkills()) {
            System.out.println(skill.getName());

            System.out.println(skills);
            if( skill.getName().equals(skills)){
                skill1 = skill;
                break;
            }
        }
        List<User> userList = userService.getUsersBySkill(skill1);

        model.addAttribute("userList",userList);
        model.addAttribute("location",location);


        return "customer/search" ;
    }





/*
    @RequestMapping(method = RequestMethod.GET, value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Skill>> listCustomer() {


        return new ResponseEntity<>(userService.getAllSkills(), HttpStatus.OK);
    }
*/

}

