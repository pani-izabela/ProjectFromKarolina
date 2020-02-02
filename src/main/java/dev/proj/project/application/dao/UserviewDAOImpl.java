package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;

import javax.persistence.EntityManager;
import java.util.List;

public class UserviewDAOImpl implements UserviewDAOCastom {

    private EntityManager em;

    public UserviewDAOImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Userview> findByUseridQuery(int userId) {
        return em.createNamedQuery(Userview.GET_USER_BY_USERID, Userview.class)
                .setParameter("userId", userId)
                .getResultList();
    }

    @Override
    public List<Userview> findByAdressidQuery(int adressId) {
        return em.createNamedQuery(Userview.GET_ADRESS_BY_ADRESSID, Userview.class)
                .setParameter("adressId", adressId)
                .getResultList();
    }

}
