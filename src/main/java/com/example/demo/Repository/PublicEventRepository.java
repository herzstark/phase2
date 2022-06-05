package com.example.demo.Repository;

import com.example.demo.entity.PublicEvent;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * This is PublicEvent Repository class
 */
public interface PublicEventRepository extends JpaRepository<PublicEvent,Integer> {


}
