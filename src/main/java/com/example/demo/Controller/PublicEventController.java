package com.example.demo.Controller;

import com.example.demo.Service.PublicEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicEventController {

    @Autowired
    PublicEventService publicEventService;

}
