package com.example.demo.entity;

/*public class Concert extends PublicEvent{
    private String performersname;
}*/

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Concert extends PublicEvent{
    private String performer;
}
