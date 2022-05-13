package com.example.demo.Controller;

import com.example.demo.Service.ShowService;
import com.example.demo.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {
    @Autowired
    public ShowService showService;

    @PostMapping("/addShow")
    public Show addShow(Show s){
        return showService.addShow(s);
    }
}