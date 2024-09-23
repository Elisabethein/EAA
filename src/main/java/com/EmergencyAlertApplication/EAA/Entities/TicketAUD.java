package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "ticketAUD")
public class TicketAUD {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    private Timestamp changeDate;
    private String change;

    public TicketAUD() {
    }

    public TicketAUD(UUID id, Ticket ticket, Timestamp changeDate, String change) {
        this.id = id;
        this.ticket = ticket;
        this.changeDate = changeDate;
        this.change = change;
    }

}
