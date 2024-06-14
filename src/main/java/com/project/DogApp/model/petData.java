    package com.project.DogApp.model;

    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.List;

    @Setter
    @Getter
    @Entity
    @Table(name = "pet_data")
    public class petData{

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_data_seq")
        @SequenceGenerator(name = "pet_data_seq", sequenceName = "pet_data_seq", allocationSize = 1)
        @Column(name = "pet_id")
        private int petID;
        @Column(name = "uid", nullable = false)
        private String userID;
        @Column(name = "species")
        private String Species;
        @Column(name = "breed")
        private String Breed;
        @Column(name = "gender")
        private String Gender;
        @Column(name = "size")
        private  String Size;

        @ElementCollection
        @CollectionTable(name = "pet_data_image_links", joinColumns = @JoinColumn(name = "pet_id"))
        @Column(name = "image_link")
        private List<String> ImageLinks;
        public petData() {
        }

        public petData(int petID, String species, String breed, String gender, String size, List<String> imageLinks) {
            this.petID = petID;
            Species = species;
            Breed = breed;
            Gender = gender;
            Size = size;
            ImageLinks = imageLinks;
        }

        @Override
        public String toString() {
            return "petData{" +
                    "petID=" + petID +
                    ", Species='" + Species + '\'' +
                    ", Breed='" + Breed + '\'' +
                    ", Gender='" + Gender + '\'' +
                    ", Size='" + Size + '\'' +
                    ", ImageLinks=" + ImageLinks +
                    '}';
        }
    }
