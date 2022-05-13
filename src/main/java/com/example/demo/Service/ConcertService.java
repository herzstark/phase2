package com.example.demo.Service;

import com.example.demo.Repository.ConcertRepository;
import com.example.demo.entity.Concert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
    @Autowired
    public ConcertRepository concertRepository;

    public Concert addConcert(Concert c){
        return concertRepository.save(c);
    }
}
