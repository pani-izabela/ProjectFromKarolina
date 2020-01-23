package dev.proj.project.application.controller;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.dao.UserViewDAO;
import dev.proj.project.application.model.User;
import dev.proj.project.application.model.UserView;
import dev.proj.project.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@org.springframework.stereotype.Controller
//@RestController
public class UserViewController {

    @Autowired
    private UserViewDAO userViewDAO;

    public UserViewController(UserViewDAO userViewDAO) {
        this.userViewDAO = userViewDAO;
    }

    //----------------------------------------------------------------------- pobieranie wszystkich użytkowników

    @RequestMapping(value = "/getUserViews", method = RequestMethod.GET)
    public @ResponseBody Iterable<UserView> getUserViews(){
        return userViewDAO.findAll();
    }



}
