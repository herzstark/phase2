package com.example.demo.Repository;

import com.example.demo.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FestivalRepository extends JpaRepository<Festival,Integer> {
    List<Festival> findByCity(String city);
}
