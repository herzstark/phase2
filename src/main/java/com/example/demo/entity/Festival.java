package com.example.demo.entity;


public class Festival {
}

/*
package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalid")
public class Festival {
    @Id
    private int festivalid;
    private String name;
    private String place;
    @OneToMany(mappedBy = "festival") //cascade = CascadeType.ALL
    private List<FestivalRun> festivalRuns;



}
*/