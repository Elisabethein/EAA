package com.EmergencyAlertApplication.EAA.Entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "usersToTags")
public class UserToTag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

    public UserToTag() {
    }

    public UserToTag(UUID id, User user, Tag tag) {
        this.id = id;
        this.user = user;
        this.tag = tag;
    }
}
