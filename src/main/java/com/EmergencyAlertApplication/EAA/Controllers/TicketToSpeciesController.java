package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.TicketToSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ticketToSpecies")
public class TicketToSpeciesController {

    @Autowired
    private TicketToSpeciesService ticketToSpeciesService;
}
