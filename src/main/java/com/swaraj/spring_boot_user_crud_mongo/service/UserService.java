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

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String id, User updateUser) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            throw new Error("user not found");
        }

        User user = optionalUser.get();

        if (updateUser.getAge() > 0) {
            user.setAge(updateUser.getAge());
        }

        if (updateUser.getName() != null) {
            user.setName(updateUser.getName());
        }

        if (updateUser.getGender() != null) {
            user.setGender(updateUser.getGender());
        }

        if (updateUser.getDob() != null) {
            user.setDob(updateUser.getDob());
        }

        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        boolean exists = userRepository.existsById(id);
        if (!exists) {
            throw new Error("user doesn't exist");
        }

        userRepository.deleteById(id);
    }
}
