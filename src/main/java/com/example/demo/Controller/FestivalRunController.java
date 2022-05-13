package com.example.demo.Controller;


import com.example.demo.Repository.FestivalRunRepository;
import com.example.demo.Service.FestivalRunService;
import com.example.demo.entity.FestivalRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalRunController {
    @Autowired
    private FestivalRunService festivalRunService;

    @PostMapping("/addFestivalRun")
    public FestivalRun addFestivalRun(@RequestBody FestivalRun f){
        return festivalRunService.addFestivalRun(f);
    }

    @GetMapping("/getFestivalRun/{festivalrunid}")
    public List<FestivalRun> getFestivalRun(@PathVariable int festivalRunId){
        return festivalRunService.getFestivalRun(festivalRunId);
    }

    @GetMapping("/getAllFestivalRun/{festivalid}")
    public List<FestivalRun> getAllFestivalRun(@PathVariable int festivalId){
        return festivalRunService.getAllFestivalRun(festivalId);
    }

    @GetMapping("/getShortFestivalRun/{duration}")
    public List<FestivalRun>  getShortFestivalRun(@PathVariable int duration){
        return festivalRunService.getShortFestivalRun(duration);
    }
}
