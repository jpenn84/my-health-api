package com.joshualeepenn.myhealth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "blood_pressure")
@Data
public class BloodPressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PositiveOrZero
    private int systolic;

    @PositiveOrZero
    private int diastolic;

    @Lob
    private String note;

    @NotEmpty
    private LocalDateTime readingTime;

}
