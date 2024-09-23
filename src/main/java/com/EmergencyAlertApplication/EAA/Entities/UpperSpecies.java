package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "upperSpecies")
public class UpperSpecies {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    public UpperSpecies() {
    }

    public UpperSpecies(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
