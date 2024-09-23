package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String species;

    public Tag() {
    }

    public Tag(UUID id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }
}
