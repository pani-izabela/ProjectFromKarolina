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

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserService userService;

    public Controller(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

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

    //----------------------------------------------------------------------- pobieranie wszystkich użytkowników

    @RequestMapping(value = "/getUsersQuery", method = RequestMethod.GET)
    public List<User> getUsersQuery(){ return userService.findAllQuery(); }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getUsers(){
        return userDAO.findAll();
    }

    //----------------------------------------------------------------------- pobieranie jednego użytkownika

    @RequestMapping(value = "/getUserQuery", method = RequestMethod.GET)
    public User getUserQuery(@RequestParam Integer userId){
        return userService.findByIdQuery(userId);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Optional<User> getUser(@RequestParam Integer userId){
        return userDAO.findById(userId);
    }

    //----------------------------------------------------------------------- dodawanie jednego użytkownika

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody User addUser(@RequestBody User user){
        return userDAO.save(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam int userId){
        userDAO.deleteById(userId);
    }


}
