package com.example.demo.Service;

import com.example.demo.Repository.OrganizerRepository;
import com.example.demo.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {
    @Autowired
    public OrganizerRepository organizerRepository;

    public Organizer addorganizer(Organizer o){
        return organizerRepository.save(o);
    }
}
