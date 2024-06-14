package com.project.DogApp.dao;

import com.project.DogApp.model.userData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDataRepository extends JpaRepository<userData,  String> {
}
