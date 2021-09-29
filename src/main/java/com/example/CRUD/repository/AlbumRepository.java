package com.example.CRUD.repository;

import com.example.CRUD.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {
}
