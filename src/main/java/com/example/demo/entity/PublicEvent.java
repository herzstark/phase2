package com.example.demo.entity;

public class PublicEvent {
}


/*
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
*/