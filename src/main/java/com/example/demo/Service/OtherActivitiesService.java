package com.example.demo.Service;

import com.example.demo.Repository.OtherActivitiesRepository;
import com.example.demo.entity.OtherActivities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherActivitiesService {
    @Autowired
    public OtherActivitiesRepository otherActivitiesRepository;

    public OtherActivities addotheractivity(OtherActivities other){
        return otherActivitiesRepository.save(other);
    }
}
