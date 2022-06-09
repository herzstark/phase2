
package com.example.demo.Controller;

import com.example.demo.DemoApplication;
import com.example.demo.entity.Concert;
import com.example.demo.entity.Show;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Controller for Concert is implemented
 */
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConcertControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;

    @Test
    void getlongestconcerts(){
        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/getlongestconcerts", Concert[].class).length, 1);
    }

}
