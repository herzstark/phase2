package com.example.demo.entity;
/*
import java.util.List;

public class Show extends PublicEvent{
    private List<String> performersname;
}*/

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
/**
 * This is Show class which builds the one of the EERD entities
 */
@Data
@Entity
@Table(name = "Shows")
public class Show extends PublicEvent{

    String performer;

    @OneToMany(mappedBy = "show")
    private List<Performer> performers;

}
