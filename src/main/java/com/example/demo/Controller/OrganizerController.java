package com.example.demo.Controller;

import com.example.demo.Service.OrganizerService;
import com.example.demo.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is the  controller class of Organizer which gets data from service class
 */
@RestController
public class OrganizerController {
    @Autowired
    public OrganizerService organizerService;

    @PostMapping("/addOrganizer")
    public Organizer addOrganizer(@RequestBody Organizer o){
        return organizerService.addorganizer(o);
    }

    /**
     * Query derivation mechanism repository class for findByFirstNameContainsOrSurnameContainsOrPhoneEqualsOrEmailStartsWith
     * @param name
     * @param phone
     * @param mail
     */
    @GetMapping("/organisersearch")
    public List<Organizer> getorganisersearch(String name, String phone, String mail)
    {return organizerService.getorganisersearch(name, phone, mail);}
}
