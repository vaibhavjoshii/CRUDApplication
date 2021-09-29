package com.example.CRUD.service;

import com.example.CRUD.model.Album;
import com.example.CRUD.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
       return albumRepository.findAll();
    }

    public Album getAlbumById(String id) {
        return albumRepository.findById(id).get();
    }

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbum( Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String id) {
        albumRepository.deleteById(id);
    }
}
