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

    @Setter
    @Getter
    private String reviewer;
    @Setter
    @Getter
    private Integer restaurantId;
    @Setter
    @Getter
    @Size(min=1, max=5)
    private Integer peanutScore;
    @Setter
    @Getter
    @Size(min=1, max=5)
    private Integer eggScore;
    @Setter
    @Getter
    @Size(min=1, max=5)
    private Integer dairyScore;
    @Setter
    @Getter
    private String comment;

    public Review() {
    }

    public Review(String reviewer,
                  Integer restaurantId,
                  Integer peanutScore,
                  Integer eggScore,
                  Integer dairyScore,
                  String comment) {
        this.reviewer = reviewer;
        this.restaurantId = restaurantId;
        this.peanutScore = peanutScore;
        this.eggScore = eggScore;
        this.dairyScore = dairyScore;
        this.comment = comment;
    }
}