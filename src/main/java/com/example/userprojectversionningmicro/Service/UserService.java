package com.example.userprojectversionningmicro.Service;

import com.example.userprojectversionningmicro.Entities.User;
import com.example.userprojectversionningmicro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getById(Long id){
        return  userRepository.findById(id);
    }
    public ResponseEntity<Object> addUtilisateur (User user) {
        userRepository.findById(user.getId()).ifPresentOrElse(
                u->{
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND,"User  already exists!!");
                },
                ()-> {
                    userRepository.save(user);
                }
        );
        return ResponseEntity.ok().body("Added with sucess");
    }
}
