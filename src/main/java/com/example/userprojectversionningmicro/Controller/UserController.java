package com.example.userprojectversionningmicro.Controller;

import com.example.userprojectversionningmicro.Entities.User;
import com.example.userprojectversionningmicro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        return userService.addUtilisateur(user);
    }
    @GetMapping("/get/{id}")
    public Optional<User> findById(@PathVariable long id){
        return  userService.getById(id);
    }
}
