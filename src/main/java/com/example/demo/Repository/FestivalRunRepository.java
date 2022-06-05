package com.example.demo.Repository;

import com.example.demo.entity.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is FestivalRun Repository class
 */
public interface FestivalRunRepository extends JpaRepository<FestivalRun,Integer> {
    public List<FestivalRun> findByDuration(int duration);
    public List<FestivalRun> findById(int festivalid);
}
