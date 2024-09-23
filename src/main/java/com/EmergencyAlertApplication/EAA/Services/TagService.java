package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.Tag;
import com.EmergencyAlertApplication.EAA.Repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    public Optional<Tag> findById(UUID id) {
        return tagRepository.findById(id);
    }

    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    public void deleteById(UUID id) {
        tagRepository.deleteById(id);
    }
}
