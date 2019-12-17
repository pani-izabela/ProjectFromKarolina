package dev.proj.project.application.service;

import dev.proj.project.application.model.User;

import java.util.List;

public interface UserService {

    User findById(int userId);

    List<User> findAll();

    User findByIdNew(int userId);
}
