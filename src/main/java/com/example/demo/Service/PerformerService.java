package com.example.demo.Service;

import com.example.demo.Repository.PerformerRepository;
import com.example.demo.entity.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformerService {

    @Autowired
    public PerformerRepository performerRepository;

    public Performer addPerformer(Performer p){
        return performerRepository.save(p);
    }

}
