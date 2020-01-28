package dev.proj.project.application.controller;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.dao.UserviewDAO;
import dev.proj.project.application.model.Home;
import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;
import dev.proj.project.application.service.UserService;
import dev.proj.project.application.service.UserviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@org.springframework.stereotype.Controller
//@RestController
public class UserviewController {

    @Autowired
    private UserviewDAO userviewDAO;
    @Autowired
    private UserviewService userviewService;


    public UserviewController(UserviewDAO userviewDAO) {
        this.userviewDAO = userviewDAO;
    }

    // --- pobieranie listy domów po użytkowniku

    @RequestMapping(value = "/getUserviews", method = RequestMethod.GET)
    public @ResponseBody Iterable<Userview> getUserviews(){
        return userviewDAO.findAll();
    }

    @RequestMapping(value = "/getUserview", method = RequestMethod.GET)
    public @ResponseBody Optional<Userview> getUserview(@RequestParam Integer id){
        return userviewDAO.findById(id);
    }

    @RequestMapping(value = "/getHomesUser", method = RequestMethod.GET)
    public @ResponseBody Iterable<Userview> getHomesUser(@RequestParam Integer userId){
        return userviewService.findByUseridQuery(userId);
    }



}
