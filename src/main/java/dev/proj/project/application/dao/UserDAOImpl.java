package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAOCastom {

    private EntityManager em;

    public UserDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public User findByIdQuery(int userId) {
        return em.createNamedQuery(User.GET_USER_BY_ID, User.class)
                .setParameter("id",userId )
                .getSingleResult();
    }

    @Override
    public List<User> findAllQuery() {
        return em.createNamedQuery(User.GET_USERS, User.class)
                .getResultList();
    }
}
