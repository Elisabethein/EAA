package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.TicketPost;
import com.EmergencyAlertApplication.EAA.Repositories.TicketPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TicketPostService {

    @Autowired
    private TicketPostRepository ticketPostRepository;

    public List<TicketPost> findAll() {
        return ticketPostRepository.findAll();
    }

    public Optional<TicketPost> findById(UUID id) {
        return ticketPostRepository.findById(id);
    }

    public TicketPost save(TicketPost ticketPost) {
        return ticketPostRepository.save(ticketPost);
    }

    public void deleteById(UUID id) {
        ticketPostRepository.deleteById(id);
    }
}
