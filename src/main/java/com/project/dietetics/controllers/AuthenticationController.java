package com.project.dietetics.controllers;

import com.project.dietetics.database.entities.User;
import com.project.dietetics.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authenticate")
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        System.out.println(user.getUsername() + ", " + user.getPassword());
        User actualUser = userService.loginUserByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (actualUser != null) {
            User act = userService.getUserById(actualUser.getId());
            return new ResponseEntity<>(act, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/registration")
    public ResponseEntity<User> registration(@RequestBody User user) {
        System.out.println(user.toString());
        User actualUser = userService.registerUser(user);
        if (actualUser != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
