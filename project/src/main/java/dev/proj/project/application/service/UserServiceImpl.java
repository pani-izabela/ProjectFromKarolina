package dev.proj.project.application.service;

import dev.proj.project.application.dao.UserDAOImpl;
import dev.proj.project.application.model.User;
import dev.proj.project.application.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;


    @Override
    public User findByIdQuery(int userId) {
        return userDAO.findByIdQuery(userId);
    }

    @Override
    public List<User> findAllQuery() {
        return userDAO.findAllQuery();
    }
}
