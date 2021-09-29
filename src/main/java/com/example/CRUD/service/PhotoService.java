package com.example.CRUD.service;

import com.example.CRUD.model.Photo;
import com.example.CRUD.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public List<Photo> getAllPhotos() {
       return photoRepository.findAll();
    }

    public Photo getPhotoById(String id) {
        return photoRepository.findById(id).get();
    }

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(String id) {
        photoRepository.deleteById(id);
    }
}
