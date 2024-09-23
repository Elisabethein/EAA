package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.TicketAUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ticketAUDs")
public class TicketAUDController {

    @Autowired
    private TicketAUDService ticketAUDService;
}
