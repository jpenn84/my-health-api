package com.joshualeepenn.myhealth.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @Enumerated(EnumType.STRING)
    private Type id;

    private boolean readPatient;

    private boolean writePatient;

    private boolean readProvider;

    private boolean writeProvider;

    public enum Type {
        PATIENT, PROVIDER, SUPER_ADMIN;
    }

}
