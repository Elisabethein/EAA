package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.TicketToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ticketToUsers")
public class TicketToUserController {

    @Autowired
    private TicketToUserService ticketToUserService;
}
