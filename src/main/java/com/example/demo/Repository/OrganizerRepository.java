package com.example.demo.Repository;

import com.example.demo.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This is Organizer Repository class
 */
public interface OrganizerRepository extends JpaRepository<Organizer,String> {
    /**
     * Query derivation mechanism repository class for findByFirstNameContainsOrSurnameContainsOrPhoneEqualsOrEmailStartsWith
     * @param name
     * @param surname
     * @param phone
     * @param mail
     */
    public List<Organizer>findByFirstNameContainsOrSurnameContainsOrPhoneEqualsOrEmailStartsWith(String name, String surname, String phone, String mail);
}
