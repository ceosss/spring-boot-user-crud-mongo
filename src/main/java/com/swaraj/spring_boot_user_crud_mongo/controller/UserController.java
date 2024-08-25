package com.swaraj.spring_boot_user_crud_mongo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("swaraj", "reo", "dev");
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return new String("swaraj" + " " + id);
    }

}
