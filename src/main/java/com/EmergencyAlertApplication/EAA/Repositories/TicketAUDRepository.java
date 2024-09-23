package com.EmergencyAlertApplication.EAA.Repositories;

import com.EmergencyAlertApplication.EAA.Entities.TicketAUD;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TicketAUDRepository extends JpaRepository<TicketAUD, UUID> {
}
