package com.example.demo.Service;


import com.example.demo.Repository.ShowRepository;
import com.example.demo.entity.Performer;
import com.example.demo.entity.Show;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
/**
 * Test Controller for Concert is implemented
 */
@ExtendWith(MockitoExtension.class)
public class ShowServiceTest {

    @InjectMocks
    ShowService showService;

    @Mock
    ShowRepository showRepository;

    @Test
    void findcrowdedshows(){

        ArrayList<Show> shows = new ArrayList<>();
        ArrayList<Performer> performers = new ArrayList<>();

        Performer p = new Performer();
        p.setPerformername("Cem Yılmaz");
        Performer p1 = new Performer();
        p1.setPerformername("Gizem");
        performers.set(0,p);
        performers.set(1,p1);

        Show s = new Show();

        s.setPerformer("Hilmi Sahballi");
        s.setPublicId(1);
        s.setStartDate(null);
        s.setStartType("11:00");
        s.setDuration(1);
        s.setName("Tulip Fest");
        s.setDescription("Dance Show");

        when(showRepository.findAll()).thenReturn(shows);

        List<Show> showList = showService.findcrowdedshows();
        assertEquals(2,showList.size());
    }
}
