package dev.proj.project.application.controller;

import org.springframework.web.bind.annotation.GetMapping;



@org.springframework.stereotype.Controller
//@RestController
public class Controller {

    @GetMapping(value = "/index")
    public String hello() {
        return "index";
    }

    @GetMapping(value = "/usersList")
    public String usersList(){ return "usersList";}

    @GetMapping(value = "/register")
    public String registerUser(){ return "register";}

    @GetMapping(value = "/login")
    public String loginUser(){ return "login";}

    @GetMapping(value = "/home")
    public String home(){ return "home";}

    @GetMapping(value = "/adress")
    public String adress(){ return "adress";}

    @GetMapping(value = "/homesList")
    public String homesList(){ return "homesList";}

}
