package com.example.demo.Service;


import com.example.demo.Repository.ConcertRepository;
import com.example.demo.entity.Concert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConcertServiceTest {

    @InjectMocks
    ConcertService concertService;


    @Mock
    ConcertRepository concertRepository;

    @Test
    void findlongestconcerts(){

        ArrayList<Concert> concerts = new ArrayList<>();
        //concerts.add(new Concert("Serdar Ortac",1,"10.08.1999","15:33",3,"Birth of Can Guclu", "Birthday Celebration"));

        Concert c = new Concert();
        c.setPerformer("Serdar Ortac");
        c.setPublicId(1);
        c.setStartDate("10.08.99");
        c.setStartType("15:33");
        c.setDuration(3);
        c.setName("Birth of Can Guclu");
        c.setDescription("Birthday Celebration");

        when(concertRepository.findAll()).thenReturn(concerts);

        List<Concert> concertList = concertService.findlongestconcerts();
        assertEquals(2,concertList.size());
    }
}