package com.example.demo.Service;

import com.example.demo.Repository.OrganizerRepository;
import com.example.demo.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is Organizer Service class which gets the data from Repository classes
 */
@Service
public class OrganizerService {
    @Autowired
    public OrganizerRepository organizerRepository;

    public Organizer addorganizer(Organizer o){
        return organizerRepository.save(o);
    }

    /**
     * Query derivation mechanism service class for findByFirstNameContainsOrSurnameContainsOrPhoneEqualsOrEmailStartsWith
     * @param name
     * @param phone
     * @param mail
     */
    public List<Organizer> getorganisersearch(String name, String phone, String mail)
    {return organizerRepository.findByFirstNameContainsOrSurnameContainsOrPhoneEqualsOrEmailStartsWith(name, name, phone, mail);}
}
