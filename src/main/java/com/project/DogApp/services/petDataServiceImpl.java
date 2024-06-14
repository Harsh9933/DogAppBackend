package com.project.DogApp.services;

import com.project.DogApp.dao.petDataRepository;
import com.project.DogApp.model.petData;
import com.project.DogApp.model.userData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class petDataServiceImpl implements petDataService{

    @Autowired
    petDataRepository petdatarep;
    @Override
    public petData uploadPetData(petData pet) {
        return petdatarep.save(pet);
    }

    @Override
    public petData getPetData(int petID) {
        Optional<petData> optionalPetData = petdatarep.findById(petID);
        return optionalPetData.orElse(null);
    }
}
