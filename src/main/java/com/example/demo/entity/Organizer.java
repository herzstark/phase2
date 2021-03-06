package com.example.demo.entity;
/*
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "organizerid")
public class Organizer {
    @Id
    private String email;
    private String surname;
    private String name;
    private String address;
    private String phone;

    @ManyToMany(mappedBy = "organizer",fetch = FetchType.EAGER)
    private List<FestivalRun> festivalRunList;

}*/



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
/**
 * This is Organizer class which builds the one of the EERD entities
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "email")
public class Organizer {

    @Id
    private String email;
    private String phone;
    private String firstName;
    private String surname;
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn (name = "festivalRunId",insertable = false, updatable = false)
    //@JoinTable(name = "frid",joinColumns = @JoinColumn(name = "festivalRunId"),inverseJoinColumns = @JoinColumn(name = "email"))
    private List<FestivalRun> festivalRuns;

    //@OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
    //private List<FestivalRunOrganizer> festivalRunOrganizerList;

}


