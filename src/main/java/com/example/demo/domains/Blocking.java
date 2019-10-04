package com.example.demo.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Blocking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long propertyId;
    private double startTime;
    private double endTime;


}
