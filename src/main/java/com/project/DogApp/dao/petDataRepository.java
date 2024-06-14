    package com.project.DogApp.dao;

    import com.project.DogApp.model.petData;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface petDataRepository extends JpaRepository<petData, Integer> {
    }
