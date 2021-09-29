package com.example.CRUD.repository;

import com.example.CRUD.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
