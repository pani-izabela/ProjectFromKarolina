package dev.proj.project.application.controller;

import dev.proj.project.application.dao.AdressDAO;
import dev.proj.project.application.dao.HomeDAO;
import dev.proj.project.application.model.Adress;
import dev.proj.project.application.model.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@org.springframework.stereotype.Controller
//@RestController
public class AdressController {

    @Autowired
    private AdressDAO adressDAO;

    public AdressController(AdressDAO adressDAO) {
        this.adressDAO = adressDAO;
    }

    //----------------------------------------------------------------------- pobieranie wszystkich użytkowników

    @RequestMapping(value = "/getAdresses", method = RequestMethod.GET)
    public @ResponseBody Iterable<Adress> getAdresses(){
        return adressDAO.findAll();
    }

    //----------------------------------------------------------------------- pobieranie jednego użytkownika

    @RequestMapping(value = "/getAdress", method = RequestMethod.GET)
    public @ResponseBody Optional<Adress> getHome(@RequestParam Integer adresId){
        return adressDAO.findById(adresId);
    }

    //----------------------------------------------------------------------- dodawanie jednego użytkownika

    @RequestMapping(value = "/addAdress", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody Adress addAdress(@RequestBody Adress adress){
        return adressDAO.save(adress);
    }

    //----------------------------------------------------------------------- usuwanie jednego użytkownika

    @RequestMapping(value = "/deleteAdress", method = RequestMethod.DELETE)
    public @ResponseBody void deleteAdress(@RequestParam int adressId){
        adressDAO.deleteById(adressId);
    }

    //----------------------------------------------------------------------- pozostałe metody



}
