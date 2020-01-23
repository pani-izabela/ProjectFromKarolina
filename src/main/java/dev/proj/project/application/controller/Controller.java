package dev.proj.project.application.controller;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.model.User;
import dev.proj.project.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


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



}
