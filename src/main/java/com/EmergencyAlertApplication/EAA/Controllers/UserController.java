package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
}
