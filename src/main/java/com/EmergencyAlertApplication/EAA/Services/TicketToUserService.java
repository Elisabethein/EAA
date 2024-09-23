package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.TicketToUser;
import com.EmergencyAlertApplication.EAA.Repositories.TicketToUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TicketToUserService {

    @Autowired
    private TicketToUserRepository ticketToUserRepository;

    public List<TicketToUser> findAll() {
        return ticketToUserRepository.findAll();
    }

    public Optional<TicketToUser> findById(UUID id) {
        return ticketToUserRepository.findById(id);
    }

    public TicketToUser save(TicketToUser ticketToUser) {
        return ticketToUserRepository.save(ticketToUser);
    }

    public void deleteById(UUID id) {
        ticketToUserRepository.deleteById(id);
    }
}
