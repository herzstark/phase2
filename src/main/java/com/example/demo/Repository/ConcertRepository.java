package com.example.demo.Repository;

import com.example.demo.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is Concert Repository class
 */
public interface ConcertRepository extends JpaRepository <Concert,Integer> {

    public List<Concert> findBydescriptionContains(String keyword);
}
