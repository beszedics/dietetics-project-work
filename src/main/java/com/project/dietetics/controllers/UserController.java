package com.project.dietetics.controllers;

import com.project.dietetics.services.UserService;
import com.project.dietetics.services.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    private UserModel getUserById(@PathVariable(name = "id") Integer id) {
        return userService.getUserById(id);
    }

}
