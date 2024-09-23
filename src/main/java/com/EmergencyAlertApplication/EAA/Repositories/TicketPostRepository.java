package com.EmergencyAlertApplication.EAA.Repositories;

import com.EmergencyAlertApplication.EAA.Entities.TicketPost;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TicketPostRepository extends JpaRepository<TicketPost, UUID> {
}
