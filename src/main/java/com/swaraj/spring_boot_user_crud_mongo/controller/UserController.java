package com.swaraj.spring_boot_user_crud_mongo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaraj.spring_boot_user_crud_mongo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        List<User> users = List.of(
                new User("Swaraj", 25, "male", LocalDate.now()),
                new User("Reo", 1, "unknown", LocalDate.now()));
        return users;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return new String("swaraj" + " " + id);
    }

}
