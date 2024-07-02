package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    @Setter
    @Getter
    private Integer yearOpened;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private Integer rating;
    @Setter
    @Getter
    private Boolean peanut;
    @Setter
    @Getter
    private Boolean egg;
    @Setter
    @Getter
    private Boolean dairy;

    public Restaurant() {
    }

    public Restaurant(Integer yearOpened,
                      String name,
                      Integer rating,
                      Boolean peanut,
                      Boolean egg,
                      Boolean dairy) {
        this.yearOpened = yearOpened;
        this.name = name;
        this.rating = rating;
        this.peanut = peanut;
        this.egg = egg;
        this.dairy = dairy;
    }
}
