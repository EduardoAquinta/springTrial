package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Setter
    @Getter
    private String username;
    @Setter
    @Getter
    private String city;
    @Setter
    @Getter
    private String state;
    @Setter
    @Getter
    private String zipcode;
    @Setter
    @Getter
    private Boolean peanut;
    @Setter
    @Getter
    private Boolean egg;
    @Setter
    @Getter
    private Boolean dairy;

    public User() {
    }

    public User(String username,
                String city,
                String state,
                String zipcode,
                Boolean peanut,
                Boolean egg,
                Boolean dairy) {
        this.username = username;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.peanut = peanut;
        this.egg = egg;
        this.dairy = dairy;
    }
}