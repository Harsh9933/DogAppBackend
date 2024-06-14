package com.project.DogApp.services;

import com.project.DogApp.model.petData;

public interface petDataService {
    public petData uploadPetData(petData pet);
    public petData getPetData(int petID);

}
