package dev.proj.project.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDAO extends CrudRepository<Users, Integer> {

    Users findById(int userId);

    @Override
    List<Users> findAll();

    @Override
    Users save(Users user);

    @Override
    void delete(Users users);
}
