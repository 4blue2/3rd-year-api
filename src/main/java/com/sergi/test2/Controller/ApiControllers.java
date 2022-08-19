package com.sergi.test2.Controller;

import com.sergi.test2.Models.User;
import com.sergi.test2.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    //autowired handles all dependency injection for us
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome my Master... What shall I do for you?";
    }

    //Return type will be a list of user(from user.java)
    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping(value = "/test")
    public String getTest(){
        return "Test successful";
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved ...";
    }

    //update functionality of the API
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();

        updateUser.setPhoneNumber(user.getPhoneNumber());
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setPostCode(user.getPostCode());
        updateUser.setAddress(user.getAddress());

        userRepo.save(updateUser);

        return "Data Updated";
    }

}
