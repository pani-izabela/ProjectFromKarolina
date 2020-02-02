package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;

import java.util.List;

public interface UserviewDAOCastom {

    List<Userview> findByUseridQuery(int userId);
    List<Userview> findByAdressidQuery(int adressId);
}
