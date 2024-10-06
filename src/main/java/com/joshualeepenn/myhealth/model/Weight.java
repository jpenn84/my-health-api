package com.joshualeepenn.myhealth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "weight")
@Data
public class Weight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PositiveOrZero
    private int weight;

    @Lob
    private String note;

    @NotEmpty
    private LocalDateTime readingTime;

}
