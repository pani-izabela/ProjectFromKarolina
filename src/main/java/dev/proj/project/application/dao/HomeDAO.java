package dev.proj.project.application.dao;

import dev.proj.project.application.model.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeDAO extends CrudRepository<Home, Integer> {
}
