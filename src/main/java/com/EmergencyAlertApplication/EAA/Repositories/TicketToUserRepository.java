package com.EmergencyAlertApplication.EAA.Repositories;

import com.EmergencyAlertApplication.EAA.Entities.TicketToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TicketToUserRepository extends JpaRepository<TicketToUser, UUID> {
}
