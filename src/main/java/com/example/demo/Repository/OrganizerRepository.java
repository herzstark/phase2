package com.example.demo.Repository;

import com.example.demo.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer,String> {
}
