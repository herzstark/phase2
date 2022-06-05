package com.example.demo.Controller;

import com.example.demo.Service.ConcertService;
import com.example.demo.entity.Concert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is the  controller class of concert which gets data from service class
 */
@RestController
public class ConcertController {
    @Autowired
    public ConcertService concertService;

    @PostMapping("/addConcert")
    public Concert addConcert(@RequestBody Concert c){
        return concertService.addConcert(c);
    }

    @GetMapping("/concertsbydescription")
    public List<Concert> concertsbydescription(String keyword){
        return concertService.getconcertsbydescription(keyword);
    }


    @GetMapping("/getlongestconcerts")
    public List<Concert> getlongestconcerts(){
        return concertService.findlongestconcerts();
    }
}
