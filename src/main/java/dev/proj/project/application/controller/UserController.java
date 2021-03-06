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
public class UserController {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserService userService;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

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
    public @ResponseBody Optional<User> getUser(@RequestParam Integer userId){
        return userDAO.findById(userId);
    }

    //----------------------------------------------------------------------- dodawanie jednego użytkownika

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody User addUser(@RequestBody User user){
        return userDAO.save(user);
    }

    //----------------------------------------------------------------------- usuwanie jednego użytkownika

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public @ResponseBody void deleteUser(@RequestParam int userId){
        userDAO.deleteById(userId);
    }

    //----------------------------------------------------------------------- pozostałe metody

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody boolean loginUser(@RequestBody User user){
        boolean userIsLogged = false;
        String email = user.getEmail();
        String pass = user.getPass();
        if (userService.findByEmailAndPass(email, pass) == true)
            userIsLogged = true;
        else userIsLogged = false;
        return userIsLogged;
    }

    @RequestMapping(value = "/getDataLoggedUser", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody User getDataLoggedUser(@RequestBody User user){
        String email = user.getEmail();
        String pass = user.getPass();
        User userFromDB = userService.findUserByEmailAndPass(email, pass);
        return userFromDB;
    }


}
