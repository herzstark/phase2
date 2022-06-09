package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private int festivalRunId;
    private String startDate;
    private int duration;

    @ManyToOne
    private Festival festival;

    @OneToMany(mappedBy = "festivalRun")
    private List<PublicEvent> publicEvent;

    @ManyToMany(mappedBy = "festivalRuns", fetch = FetchType.EAGER)
    private List<Organizer> organizers;

}
