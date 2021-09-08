package com.project.dietetics.services;

import com.project.dietetics.database.entities.UserEntity;
import com.project.dietetics.database.repositories.UserRepository;
import com.project.dietetics.services.converters.UserConverter;
import com.project.dietetics.services.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {

        Iterable<UserEntity> iterableUsers = userRepository.findAll();

        UserConverter userConverter = new UserConverter();

        List<UserModel> users = new ArrayList<>();

        for (UserEntity user : iterableUsers) {
            users.add(userConverter.entityToModel(user));
        }

        return users;
    }

    public UserModel getUserById(Integer id) {
        Optional<UserEntity> user = userRepository.findById(id);

        UserConverter userConverter = new UserConverter();

        UserModel userModel = null;

        if (user.isPresent()) {
            userModel = userConverter.entityToModel(user.get());
        }

        return userModel;
    }
}
