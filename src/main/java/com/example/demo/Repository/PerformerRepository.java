package com.example.demo.Repository;

import com.example.demo.entity.Performer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformerRepository extends JpaRepository <Performer, Integer>{
}
