package com.project.DogApp.controller;

import com.project.DogApp.model.petData;
import com.project.DogApp.services.petDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class petDataController {
    @Autowired
    private petDataService petdataservice;

    @PostMapping("/pet")
    public petData uploadPetData(@RequestBody petData pet){
        return petdataservice.uploadPetData(pet);
    }
    @GetMapping("/pet/{id}")
    public petData getPetDataById(@PathVariable int id) {
        return petdataservice.getPetData(id);
    }
}
