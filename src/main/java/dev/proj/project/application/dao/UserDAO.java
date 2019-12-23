package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends CrudRepository<User, Integer>, UserDAOCastom {


}
