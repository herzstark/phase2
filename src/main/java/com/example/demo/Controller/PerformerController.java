package com.example.demo.Controller;

import com.example.demo.Service.ConcertService;
import com.example.demo.Service.PerformerService;
import com.example.demo.entity.Concert;
import com.example.demo.entity.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerformerController {

    @Autowired
    public PerformerService performerService;

    @PostMapping("/addPerformer")
    public Performer addPerformer(@RequestBody Performer p){
        return performerService.addPerformer(p);
    }

}
