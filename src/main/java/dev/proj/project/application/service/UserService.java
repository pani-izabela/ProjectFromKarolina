package dev.proj.project.application.service;

import dev.proj.project.application.model.User;

import java.util.List;

public interface UserService {

    User findByIdQuery(int userId);

    List<User> findAllQuery();

    boolean findByEmailAndPass(String email, String pass);
}
