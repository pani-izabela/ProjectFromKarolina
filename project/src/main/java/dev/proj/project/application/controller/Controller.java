package dev.proj.project.application.controller;

import dev.proj.project.application.dao.Users;
import dev.proj.project.application.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersService.getAllUsers();
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Optional<Users> getUser(@RequestParam Integer userId){
        return usersService.getUser(userId);
    }
}
