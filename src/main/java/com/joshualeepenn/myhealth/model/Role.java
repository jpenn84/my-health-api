package com.joshualeepenn.myhealth.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {

    // Roles are preloaded at application startup from data.sql in src/main/resources
    // Changes made to the class structure or Type enum will need a corresponding change in that file.
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
