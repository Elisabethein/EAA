package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.TicketAUD;
import com.EmergencyAlertApplication.EAA.Repositories.TicketAUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TicketAUDService {

    @Autowired
    private TicketAUDRepository ticketAUDRepository;

    public List<TicketAUD> findAll() {
        return ticketAUDRepository.findAll();
    }

    public Optional<TicketAUD> findById(UUID id) {
        return ticketAUDRepository.findById(id);
    }

    public TicketAUD save(TicketAUD ticketAUD) {
        return ticketAUDRepository.save(ticketAUD);
    }

    public void deleteById(UUID id) {
        ticketAUDRepository.deleteById(id);
    }
}
