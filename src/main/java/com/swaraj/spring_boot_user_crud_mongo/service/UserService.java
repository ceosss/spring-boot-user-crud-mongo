package com.swaraj.spring_boot_user_crud_mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.swaraj.spring_boot_user_crud_mongo.model.User;
import com.swaraj.spring_boot_user_crud_mongo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(String id) {
        return userRepository.findById(id);
    }
}
