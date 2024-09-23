package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String status;
    private String species;
    private Timestamp openDate;
    private Timestamp closeDate;
    private String description;
    private String location;
    private String writtenLocation;
    private String directions;
    private String county;
    private boolean transportPossibility;
    private boolean reporterCanWait;
    private String reporterName;
    private String reporterPhone;
    private String language;
    private String notificationSource;
    private String injuryType;
    private Timestamp createdAt;

    public Ticket() {
    }

    public Ticket(UUID id, String status, String species, Timestamp openDate, Timestamp closeDate, String description,
                  String location, String writtenLocation, String directions, String county, boolean transportPossibility,
                  boolean reporterCanWait, String reporterName, String reporterPhone, String language, String notificationSource,
                  String injuryType, Timestamp createdAt) {
        this.id = id;
        this.status = status;
        this.species = species;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.description = description;
        this.location = location;
        this.writtenLocation = writtenLocation;
        this.directions = directions;
        this.county = county;
        this.transportPossibility = transportPossibility;
        this.reporterCanWait = reporterCanWait;
        this.reporterName = reporterName;
        this.reporterPhone = reporterPhone;
        this.language = language;
        this.notificationSource = notificationSource;
        this.injuryType = injuryType;
        this.createdAt = createdAt;
    }

}
