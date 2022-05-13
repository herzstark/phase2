package com.example.demo.Controller;

import com.example.demo.Service.FestivalService;
import com.example.demo.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalController {
    @Autowired
    private FestivalService festivalService;

    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival f){
        return festivalService.addFestival(f);
    }

    @GetMapping("/getFestival/{festivalid}")
    public Festival getFestival(@PathVariable int festivalid){
        return festivalService.getFestival(festivalid);
    }
    @GetMapping("/getAllFestivals")
    public List<Festival> getAllFestivals(){
        return festivalService.getAllFestival();
    }

    @GetMapping("/getFestivalsForaCity/{city}")
    public List<Festival> getFestivalsForaCity(@PathVariable String city){
        return festivalService.getFestivalsForaCity(city);
    }

}
