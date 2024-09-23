package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "ticketPosts")
public class TicketPost {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Timestamp postDate;
    private String post;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public TicketPost() {
    }

    public TicketPost(UUID id, Timestamp postDate, String post, Ticket ticket, User user) {
        this.id = id;
        this.postDate = postDate;
        this.post = post;
        this.ticket = ticket;
        this.user = user;
    }

}
