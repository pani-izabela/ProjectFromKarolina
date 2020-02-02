package dev.proj.project.application.service;

import dev.proj.project.application.dao.UserDAO;
import dev.proj.project.application.dao.UserviewDAO;
import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserviewServiceImpl implements UserviewService {
    @Autowired
    private UserviewDAO userviewDAO;

    @Override
    public List<Userview> findByUseridQuery(int userId) {
        return userviewDAO.findByUseridQuery(userId);
    }

    @Override
    public List<Userview> findByAdressidQuery(int adressId) {
        return userviewDAO.findByAdressidQuery(adressId);
    }
}
