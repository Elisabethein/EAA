package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.VetFile;
import com.EmergencyAlertApplication.EAA.Repositories.VetFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VetFileService {

    @Autowired
    private VetFileRepository vetFileRepository;

    public List<VetFile> findAll() {
        return vetFileRepository.findAll();
    }

    public Optional<VetFile> findById(UUID id) {
        return vetFileRepository.findById(id);
    }

    public VetFile save(VetFile vetFile) {
        return vetFileRepository.save(vetFile);
    }

    public void deleteById(UUID id) {
        vetFileRepository.deleteById(id);
    }
}
