package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/species")
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;
}
