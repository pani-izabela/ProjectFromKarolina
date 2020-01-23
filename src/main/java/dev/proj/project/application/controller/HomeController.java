package dev.proj.project.application.controller;

import dev.proj.project.application.dao.HomeDAO;
import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.model.Home;
import dev.proj.project.application.model.User;
import dev.proj.project.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@org.springframework.stereotype.Controller
//@RestController
public class HomeController {

    @Autowired
    private HomeDAO homeDAO;

    public HomeController(HomeDAO homeDAO) {
        this.homeDAO = homeDAO;
    }

    //----------------------------------------------------------------------- pobieranie wszystkich użytkowników

    @RequestMapping(value = "/getHomes", method = RequestMethod.GET)
    public @ResponseBody Iterable<Home> getHomes(){
        return homeDAO.findAll();
    }

    //----------------------------------------------------------------------- pobieranie jednego użytkownika

    @RequestMapping(value = "/getHome", method = RequestMethod.GET)
    public @ResponseBody Optional<Home> getUser(@RequestParam Integer homeId){
        return homeDAO.findById(homeId);
    }

    //----------------------------------------------------------------------- dodawanie jednego użytkownika

    @RequestMapping(value = "/addHome", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody Home addHome(@RequestBody Home home){
        return homeDAO.save(home);
    }

    //----------------------------------------------------------------------- usuwanie jednego użytkownika

    @RequestMapping(value = "/deleteHome", method = RequestMethod.DELETE)
    public @ResponseBody void deleteHome(@RequestParam int homeId){
        homeDAO.deleteById(homeId);
    }

    //----------------------------------------------------------------------- pozostałe metody



}
