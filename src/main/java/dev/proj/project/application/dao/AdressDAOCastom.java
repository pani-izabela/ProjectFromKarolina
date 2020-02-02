package dev.proj.project.application.dao;

import dev.proj.project.application.model.Adress;

public interface AdressDAOCastom {
    Adress findByStreetAnsNrHomeAndNrFlatAndCityQuery(String street, String nrHome, String nrFlat, String city);
}
