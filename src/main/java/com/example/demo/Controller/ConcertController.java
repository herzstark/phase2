package com.example.demo.Controller;

import com.example.demo.Service.ConcertService;
import com.example.demo.entity.Concert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcertController {
    @Autowired
    public ConcertService concertService;

    @PostMapping("/addConcert")
    public Concert addConcert(@RequestBody Concert c){
        return concertService.addConcert(c);
    }
}
