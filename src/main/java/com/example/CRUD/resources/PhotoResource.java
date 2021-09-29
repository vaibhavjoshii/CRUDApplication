package com.example.CRUD.resources;

import com.example.CRUD.model.Photo;
import com.example.CRUD.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @GetMapping
    public List<Photo> getAllPhotos(){
      return photoService.getAllPhotos();
    }

    @GetMapping("/find")
    public Photo getPhotoById(@RequestParam("id") String id){
        return photoService.getPhotoById(id);
    }

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo) {
        return photoService.savePhoto(photo);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo) {
        return photoService.updatePhoto( photo );
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id") String id){
        photoService.deletePhoto(id);
    }
}
