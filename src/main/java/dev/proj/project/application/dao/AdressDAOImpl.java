package dev.proj.project.application.dao;

import dev.proj.project.application.model.Adress;

import javax.persistence.EntityManager;

public class AdressDAOImpl implements AdressDAOCastom {

    private EntityManager em;

    public AdressDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Adress findByStreetAnsNrHomeAndNrFlatAndCityQuery(String street, String nrHome, String nrFlat, String city) {
        return em.createNamedQuery(Adress.GET_ADRESS_BY_STREET_AND_NRHOME_AND_NRFLAT_AND_CITY, Adress.class)
                .setParameter("street", street)
                .setParameter("nrhome", nrHome)
                .setParameter("nrflat", nrFlat)
                .setParameter("city", city)
                .getSingleResult();
    }
}
