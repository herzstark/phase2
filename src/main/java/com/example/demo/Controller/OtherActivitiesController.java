package com.example.demo.Controller;

import com.example.demo.Service.OtherActivitiesService;
import com.example.demo.entity.OtherActivities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the  controller class of OtherActivities which gets data from service class
 */
@RestController
public class OtherActivitiesController {
    @Autowired
    public OtherActivitiesService otherActivitiesService;

    @PostMapping("/addotheractivity")
    public OtherActivities addotheractivity(@RequestBody OtherActivities other){
        return otherActivitiesService.addotheractivity(other);
    }
}
