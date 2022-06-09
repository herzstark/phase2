package com.example.demo.Repository;

import com.example.demo.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is Show Repository class
 */
public interface ShowRepository extends JpaRepository<Show,Integer> {
    /**
     * Query derivation mechanism repository class for findBydurationContains
     * @param duration
     */
    public List<Show> findBydurationContains(int duration);
}
