package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String reviewer;
    private Integer restaurantId;
    @Size(min=1, max=5)
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    private String comment;
}