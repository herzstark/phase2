package com.example.demo.entity;

/*public class Concert extends PublicEvent{
    private String performersname;
}*/

import lombok.Data;

import javax.persistence.Entity;

/**
 * This is Concert class which builds the one of the EERD entities
 */
@Data
@Entity
public class Concert extends PublicEvent{
    private String performer;
}
