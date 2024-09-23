package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.Application;
import com.EmergencyAlertApplication.EAA.Repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    public Optional<Application> findById(UUID id) {
        return applicationRepository.findById(id);
    }

    public Application save(Application application) {
        return applicationRepository.save(application);
    }

    public void deleteById(UUID id) {
        applicationRepository.deleteById(id);
    }
}
