package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.Ticket;
import com.EmergencyAlertApplication.EAA.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    public Optional<Ticket> findById(UUID id) {
        return ticketRepository.findById(id);
    }

    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void deleteById(UUID id) {
        ticketRepository.deleteById(id);
    }
}
