package dev.proj.project.application.controller;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.model.User;
import dev.proj.project.application.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
public class Controller {

    @Autowired
    private UserServiceImpl userService;

    private UserDAO userDAO;

    public Controller(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "/work", method = RequestMethod.GET)
    public String work() {
        return "Aplikacja działa";
    }

    /*@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getAllUsers();
    }*/

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> getUsers(){
        return userDAO.findAll();
    }

    @RequestMapping(value = "/getAllUsers1", method = RequestMethod.GET)
    public List<User> getUsers1(){
        return userDAO.findAll();
    }

//    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
//    public Optional<User> getUser(@RequestParam Integer userId){
//        return userService.getUser(userId);
//    }
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam Integer userId){
    return userService.findById(userId);
}

    @RequestMapping(value = "/getUserNew", method = RequestMethod.GET)
    public User getUserNew(@RequestParam Integer userId){
        return userService.findByIdNew(userId);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @RequestMapping(value = "/getAllUsersQuery", method = RequestMethod.GET)
    public List<User> getUsersQuery(){
        return userService.getAllUsersQuery();
    }

    @RequestMapping(value = "/getUserQuery", method = RequestMethod.GET)
    public User getUserQuery(@RequestParam Integer userId){
        return userService.getUserQuery(userId);
    }

}
