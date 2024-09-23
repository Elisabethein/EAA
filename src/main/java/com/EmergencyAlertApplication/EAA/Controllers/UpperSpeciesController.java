package com.EmergencyAlertApplication.EAA.Controllers;

import com.EmergencyAlertApplication.EAA.Services.UpperSpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/upperSpecies")
public class UpperSpeciesController {

    @Autowired
    private UpperSpeciesService upperSpeciesService;
}
