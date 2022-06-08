package com.example.demo.Service;

import com.example.demo.Repository.ShowRepository;
import com.example.demo.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Show Service class which gets the data from Repository classes
 */
@Service
public class ShowService {
    @Autowired
    public ShowRepository showRepository;

    public Show addShow(Show s){
        return showRepository.save(s);
    }

    public List<Show> getshowsbyduration(int duration){
        return showRepository.findBydurationContains(duration);
    }

    public List<Show> findcrowdedshows(){
        int crowded = -1;

        ArrayList<Show> results = new ArrayList<>();
        List<Show> shows = showRepository.findAll();
        for(Show availableshows: shows){
            if(crowded < availableshows.getPerformer().length()){
                crowded = availableshows.getPerformer().length();
            }
        }
        for(Show availableshows: shows){
            if(availableshows.getPerformer().length() == crowded)
                results.add(availableshows);
        }
        return results;
    }



}
