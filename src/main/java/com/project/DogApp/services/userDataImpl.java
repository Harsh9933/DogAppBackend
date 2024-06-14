package com.project.DogApp.services;

import com.project.DogApp.dao.userDataRepository;
import com.project.DogApp.model.userData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userDataImpl implements userDataService{

    @Autowired
    userDataRepository userdatarep;

    @Override
    public userData uploadUserData(userData user) {
        return userdatarep.save(user);
    }

    @Override
    public userData getUserData(String uid) {
        Optional<userData> optionalUserData = userdatarep.findById(uid);
        return optionalUserData.orElse(null);
    }
}
