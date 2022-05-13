package com.example.demo.Service;

import com.example.demo.Repository.FestivalRepository;
import com.example.demo.entity.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {
    @Autowired
    private FestivalRepository festivalRepository;

    public Festival addFestival(Festival f){
        return festivalRepository.save(f);
    }

    public List<Festival> getAllFestival(){
        return festivalRepository.findAll();
    }

    public Festival getFestival(int festivalid) {
        return festivalRepository.findById(festivalid).orElse(null);
    }
    public List<Festival> getFestivalsForaCity(String city){
        return festivalRepository.findByCity(city);
    }
}
