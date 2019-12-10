package dev.proj.project.application.service;

import dev.proj.project.application.dao.Users;
import dev.proj.project.application.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersDAO usersDAO;



    public List<Users> getAllUsers(){
        return usersDAO.findAll();
    }

    public Optional<Users> getUser(Integer id){
        return usersDAO.findById(id);
    }

    public Users saveUser(Users user){
        return usersDAO.save(user);
    }

    public void deleteUser(Users user){
        usersDAO.delete(user);
    }
}
