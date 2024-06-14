package com.project.DogApp.services;

import com.project.DogApp.model.userData;
import org.springframework.stereotype.Service;

public interface userDataService {

    public userData uploadUserData(userData user);
    public userData getUserData(String  uid);

}
