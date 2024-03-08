package vn.edu.iuh.fit.user_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.user_service.models.User;
import vn.edu.iuh.fit.user_service.repositories.UserRepository;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userRepository.findById(id).get();
    }

    @DeleteMapping("/user/{id}")
    public boolean deleteUserById(@PathVariable("id") long id){
        userRepository.deleteById(id);
        return true;
    }
}
