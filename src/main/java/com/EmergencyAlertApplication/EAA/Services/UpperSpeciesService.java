package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.UpperSpecies;
import com.EmergencyAlertApplication.EAA.Repositories.UpperSpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UpperSpeciesService {

    @Autowired
    private UpperSpeciesRepository upperSpeciesRepository;

    public List<UpperSpecies> findAll() {
        return upperSpeciesRepository.findAll();
    }

    public Optional<UpperSpecies> findById(UUID id) {
        return upperSpeciesRepository.findById(id);
    }

    public UpperSpecies save(UpperSpecies upperSpecies) {
        return upperSpeciesRepository.save(upperSpecies);
    }

    public void deleteById(UUID id) {
        upperSpeciesRepository.deleteById(id);
    }
}
