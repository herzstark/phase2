package com.example.demo.entity;
/*
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "publiceventid")
public class PublicEvent {
    @Id
    private int publicid;
    private Date date;
    private int duration;
    private String description;
    private String name;
    private String starttime;

    @ManyToOne
    @JoinColumn(name = "festivalrunid", insertable = false, updatable = false)
    private FestivalRun festivalRun;

}
*/


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
/**
 * This is PublicEvent class which builds the one of the EERD entities
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "publicId")
public class PublicEvent {
    @Id
    private int publicId;
    private Date startDate;
    private String startType;
    private int duration;
    private String name;
    private String description;



    //@OneToMany(mappedBy = "festivalRun", cascade = CascadeType.ALL)
    //private List<Festival> festivals;

    @ManyToOne
    @JoinColumn(name = "festivalRunId",insertable = false, updatable = false)
    private FestivalRun festivalRun;


}
