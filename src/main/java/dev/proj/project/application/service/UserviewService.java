package dev.proj.project.application.service;

import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;

import java.util.List;

public interface UserviewService {

    List<Userview> findByUseridQuery(int userId);

    List<Userview> findByAdressidQuery(int adressId);
}
