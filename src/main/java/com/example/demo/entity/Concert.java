package com.example.demo.entity;

/*public class Concert extends PublicEvent{
    private String performersname;
}*/

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * This is Concert class which builds the one of the EERD entities
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Concert extends PublicEvent{
    private String performer;
}
