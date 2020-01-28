package dev.proj.project.application.dao;

import dev.proj.project.application.model.User;
import dev.proj.project.application.model.Userview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserviewDAO extends CrudRepository<Userview, Integer>, UserviewDAOCastom {


}
