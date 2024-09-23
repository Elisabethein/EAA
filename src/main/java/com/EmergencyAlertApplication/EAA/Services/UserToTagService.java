package com.EmergencyAlertApplication.EAA.Services;

import com.EmergencyAlertApplication.EAA.Entities.UserToTag;
import com.EmergencyAlertApplication.EAA.Repositories.UserToTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserToTagService {

    @Autowired
    private UserToTagRepository userToTagRepository;

    public List<UserToTag> findAll() {
        return userToTagRepository.findAll();
    }

    public Optional<UserToTag> findById(UUID id) {
        return userToTagRepository.findById(id);
    }

    public UserToTag save(UserToTag userToTag) {
        return userToTagRepository.save(userToTag);
    }

    public void deleteById(UUID id) {
        userToTagRepository.deleteById(id);
    }
}
