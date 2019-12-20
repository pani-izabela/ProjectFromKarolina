package dev.proj.project.application.controller;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.model.User;
import dev.proj.project.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
public class Controller {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserService userService;

    public Controller(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

    //----------------------------------------------------------------------- pobieranie wszystkich użytkowników

    @RequestMapping(value = "/getUsersQuery", method = RequestMethod.GET)
    public List<User> getUsersQuery(){ return userService.findAllQuery(); }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public Iterable<User> getUsers(){
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
    public User addUser(@RequestBody User user){
        return userDAO.save(user);
    }

    /*@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam int userId){
        return userDAO.deleteById(userId);
    }*/


}
