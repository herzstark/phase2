package com.example.demo.Service;

import com.example.demo.Repository.PublicEventRepository;
import com.example.demo.entity.PublicEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * This is PublicEvent Service class which gets the data from Repository classes
 */
@Service
public class PublicEventService {
    @Autowired
    public PublicEventRepository publicEventRepository;

    public PublicEvent savePublicEvent(PublicEvent p){
        return publicEventRepository.save(p);
    }
}

