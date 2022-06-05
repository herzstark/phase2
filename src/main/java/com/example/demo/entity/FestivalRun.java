package com.example.demo.entity;
/*
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalrunid")
public class FestivalRun {
    @Id
    private int festivalrunid;
    private Date sdate;
    private int duration;

    @ManyToOne
    private Festival festival;

    @OneToMany(mappedBy = "festivalrun")
    private List<PublicEvent> publicEventList;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Organizer> organizers;


}*/




import com.example.demo.Service.FestivalRunService;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
/**
 * This is FestivalRun class which builds the one of the EERD entities
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalRunId")
public class FestivalRun {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "festivalRunId")

    private int festivalRunId;
    private Date startDate;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "festivalid",insertable = false, updatable = false)
    private Festival festival;

    @OneToMany(mappedBy = "festivalRun")
    private List<PublicEvent> publicEvent;

    @ManyToMany(mappedBy = "festivalRuns", fetch = FetchType.EAGER)
    private List<Organizer> organizers;


  //  @OneToMany(mappedBy = "festivalrun", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //  private List<FestivalRunOrganizer> festivalRunOrganizerList;

}
