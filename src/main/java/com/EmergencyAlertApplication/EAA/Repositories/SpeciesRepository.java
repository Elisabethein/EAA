package com.EmergencyAlertApplication.EAA.Repositories;

import com.EmergencyAlertApplication.EAA.Entities.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SpeciesRepository extends JpaRepository<Species, UUID> {
}
