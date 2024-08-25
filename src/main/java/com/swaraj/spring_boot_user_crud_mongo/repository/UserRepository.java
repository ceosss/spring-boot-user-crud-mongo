package com.swaraj.spring_boot_user_crud_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.swaraj.spring_boot_user_crud_mongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
