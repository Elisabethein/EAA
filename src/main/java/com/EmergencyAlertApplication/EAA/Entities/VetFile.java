package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "vetFiles")
public class VetFile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String documentRef;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public VetFile() {
    }

    public VetFile(UUID id, String documentRef, Ticket ticket) {
        this.id = id;
        this.documentRef = documentRef;
        this.ticket = ticket;
    }

}
