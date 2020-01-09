package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;

import java.util.List;

public interface UserDAOCastom {
    User findByIdQuery(int id);
    List<User> findAllQuery();
    User findByEmailAndPassQuery(String email, String pass);
}
