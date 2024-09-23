package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String status;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNr;
    private String streetName;
    private int streetNr;
    private String city;
    private String county;
    private String postalCode;
    private String email;
    private String password;
    private String question1;
    private String question2;
    private String question3;
    private Timestamp createdAt;

    public Application() {
    }

    public Application(UUID id, String status, String firstName, String lastName, String birthDate, String phoneNr,
                       String streetName, int streetNr, String city, String county, String postalCode, String email,
                       String password, String question1, String question2, String question3, Timestamp createdAt) {
        this.id = id;
        this.status = status;
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
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.createdAt = createdAt;
    }
}
