package com.example.demo.Service;

import com.example.demo.Repository.ShowRepository;
import com.example.demo.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
    public ShowRepository showRepository;

    public Show addShow(Show s){
        return showRepository.save(s);
    }

}
