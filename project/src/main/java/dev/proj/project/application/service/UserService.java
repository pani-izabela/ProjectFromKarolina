package dev.proj.project.application.service;

import dev.proj.project.application.model.User;

public interface UserService {

    User findById(int userId);
}
