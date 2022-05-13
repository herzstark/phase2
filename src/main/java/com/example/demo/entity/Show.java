package com.example.demo.entity;
/*
import java.util.List;

public class Show extends PublicEvent{
    private List<String> performersname;
}*/

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Data
@Entity
public class Show extends PublicEvent{
    List<String> performer;
}
