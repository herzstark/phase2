package com.example.demo.entity;
/*
import java.util.List;

public class Show extends PublicEvent{
    private List<String> performersname;
}*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
/**
 * This is Show class which builds the one of the EERD entities
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Shows")
public class Show extends PublicEvent{

    // getPerformer() || getPerformers(), service bak
    //performer ve performers, postmane bak

    String performer;

    @OneToMany(mappedBy = "show")
    private List<Performer> performers;

}
