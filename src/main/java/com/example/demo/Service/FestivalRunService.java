package com.example.demo.Service;

import com.example.demo.Repository.FestivalRepository;
import com.example.demo.Repository.FestivalRunRepository;
import com.example.demo.entity.FestivalRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalRunService {
    @Autowired
    private FestivalRunRepository festivalRunRepository;
    private FestivalRepository festival;
    int i = 1;

    public FestivalRun addFestivalRun(FestivalRun f){
        return festivalRunRepository.save(f);
    }

    public List<FestivalRun> getFestivalRun(int festivalRunId){
        return festivalRunRepository.findById(festivalRunId);}
    public List<FestivalRun> getAllFestivalRun(int festivalid){
        return festivalRunRepository.findById(festivalid);
    }

    public List<FestivalRun>  getShortFestivalRun(int duration){
        return festivalRunRepository.findByFestivalRunDuration(duration);
    }

}
