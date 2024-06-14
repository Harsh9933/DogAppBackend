package com.project.DogApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "user_data")
public class userData {
    @Id
    private String uid;
    private String name;
    @Column(name = "profilepictureurl")
    private String profilePictureUrl;
    private String bio;

    public userData() {
    }

    public userData(String uid, String name, String profilePictureUrl, String bio) {
        this.uid = uid;
        this.name = name;
        this.profilePictureUrl = profilePictureUrl;
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "userData{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", profilePictureUrl='" + profilePictureUrl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}

