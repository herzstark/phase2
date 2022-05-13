package com.example.demo.entity;

public class Organizer {
}


/*
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

 */
