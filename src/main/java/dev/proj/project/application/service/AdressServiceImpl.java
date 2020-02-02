package dev.proj.project.application.service;

import dev.proj.project.application.dao.AdressDAO;
import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.model.Adress;
import dev.proj.project.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressServiceImpl implements AdressService {
    @Autowired
    private AdressDAO adressDAO;

    @Override
    public Adress findByStreetAnsNrHomeAndNrFlatAndCityQuery(String street, String nrHome, String nrFlat, String city) {
        Adress adress = adressDAO.findByStreetAnsNrHomeAndNrFlatAndCityQuery(street, nrHome, nrFlat, city);
        return adress;
    }
}
