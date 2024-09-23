package com.EmergencyAlertApplication.EAA.Repositories;

import com.EmergencyAlertApplication.EAA.Entities.VetFile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface VetFileRepository extends JpaRepository<VetFile, UUID> {
}
