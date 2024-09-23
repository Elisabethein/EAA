package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;
}
