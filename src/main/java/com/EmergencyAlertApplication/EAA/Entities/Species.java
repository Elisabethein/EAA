package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private UUID upperSpecies;

    public Species() {
    }

    public Species(UUID id, String name, UUID upperSpecies) {
        this.id = id;
        this.name = name;
        this.upperSpecies = upperSpecies;
    }

}
