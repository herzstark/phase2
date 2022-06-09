package com.example.demo.Controller;

import com.example.demo.Service.FestivalService;
import com.example.demo.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is the  controller class of Festival which gets data from service class
 */
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

    /**
     * controller class for query to get popular festivals
     */
   @GetMapping("/popularfestivals")
    public  List<Festival> getpopularfestivals(){return festivalService.getpopularfestivals();}

    /**
     * controller for query to get festival by name
     * @param name
     */
    @GetMapping("/festivalsbyname/{name}")
    public List<Festival> getfestivalsbyname(String name){return  festivalService.getfestivalsbyname(name);}
}
