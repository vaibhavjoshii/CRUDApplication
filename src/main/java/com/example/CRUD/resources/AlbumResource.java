package com.example.CRUD.resources;

import com.example.CRUD.model.Album;
import com.example.CRUD.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/find")
    public Album getAlbumById(@RequestParam("id") String id){
        return albumService.getAlbumById(id);
    }

    @PostMapping
    public Album saveAlbum(@RequestBody @Valid Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody @Valid Album album) {
        return albumService.updateAlbum( album );
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "id") String id){
        albumService.deleteAlbum(id);
    }
}
