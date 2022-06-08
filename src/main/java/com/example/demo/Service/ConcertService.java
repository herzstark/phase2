package com.example.demo.Service;

import com.example.demo.Repository.ConcertRepository;
import com.example.demo.entity.Concert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Concert Service class which gets the data from Repository classes
 */
@Service
public class ConcertService {
    @Autowired
    public ConcertRepository concertRepository;

    public Concert addConcert(Concert c){
        return concertRepository.save(c);
    }

    public List<Concert> getconcertsbydescription(String keyword){
        return concertRepository.findBydescriptionContains(keyword);
    }

    public List<Concert> findlongestconcerts() {
        int longest = -1;

        ArrayList<Concert> results = new ArrayList<>();
        List<Concert> concerts = concertRepository.findAll();

        for (Concert availableconcert : concerts) {
            if (longest < availableconcert.getDuration()) {
                longest = availableconcert.getDuration();
            }
        }
        for (Concert availableconcert : concerts) {
            if (availableconcert.getDuration() == longest) {
                results.add(availableconcert);
            }
        }
        return results;
    }
}
