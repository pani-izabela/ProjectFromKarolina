package dev.proj.project.application.service;

import dev.proj.project.application.model.Adress;
import dev.proj.project.application.model.User;

import java.util.List;

public interface AdressService {

    Adress findByStreetAnsNrHomeAndNrFlatAndCityQuery(String street, String nrHome, String nrFlat, String city);
}
