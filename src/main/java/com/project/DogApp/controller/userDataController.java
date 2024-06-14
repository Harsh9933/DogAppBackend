package com.project.DogApp.controller;

import com.project.DogApp.model.userData;
import com.project.DogApp.services.userDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userDataController {
    @Autowired
    private userDataService userdataservice;

    @PostMapping("/user")
    public userData uploadUserData(@RequestBody userData user){
       return userdataservice.uploadUserData(user);
   }

    @GetMapping("/user/{uid}")
    public userData getUserDataById(@PathVariable String uid) {
        return userdataservice.getUserData(uid);
    }
}
