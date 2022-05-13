package com.example.demo.Repository;

import com.example.demo.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository <Concert,Integer> {
}
