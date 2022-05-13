package com.example.demo.Controller;

import com.example.demo.Service.OrganizerService;
import com.example.demo.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizerController {
    @Autowired
    public OrganizerService organizerService;

    @PostMapping("/addOrganizer")
    public Organizer addOrganizer(@RequestBody Organizer o){
        return organizerService.addorganizer(o);
    }
}
