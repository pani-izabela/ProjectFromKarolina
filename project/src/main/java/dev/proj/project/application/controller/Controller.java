package dev.proj.project.application.controller;

import dev.proj.project.application.dao.Users;
import dev.proj.project.application.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


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

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody Users user){
        usersService.saveUser(user);
    }
}
