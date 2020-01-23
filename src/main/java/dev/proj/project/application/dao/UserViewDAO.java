package dev.proj.project.application.dao;

import dev.proj.project.application.model.Home;
import dev.proj.project.application.model.UserView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserViewDAO extends CrudRepository<UserView, Integer> {
}
