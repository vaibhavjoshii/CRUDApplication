package com.example.CRUD.repository;

import com.example.CRUD.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
