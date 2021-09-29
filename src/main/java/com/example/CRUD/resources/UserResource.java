package com.example.CRUD.resources;

import com.example.CRUD.exception.RestrictedInfoException;
import com.example.CRUD.model.User;
import com.example.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public User getUserById(@RequestParam("id") String id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws RestrictedInfoException {
        if(user.name.toString().equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return userService.saveUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody @Valid User user) throws RestrictedInfoException {
        if(user.name.toString().equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return userService.updateUser( user );
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "id") String id){
        userService.deleteUser(id);
    }
}
