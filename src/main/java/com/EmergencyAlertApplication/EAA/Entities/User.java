package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String phoneNr;
    private String streetName;
    private int streetNr;
    private String city;
    private String county;
    private String postalCode;
    private String email;
    private String password;
    private String role;
    private Timestamp createdAt;

    public User() {
    }

    // Parameterized constructor
    public User(UUID id, String firstName, String lastName, java.sql.Date birthDate, String phoneNr, String streetName,
                int streetNr, String city, String county, String postalCode, String email, String password, String role,
                Timestamp createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
        this.streetName = streetName;
        this.streetNr = streetNr;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
    }
}
