package com.example.testserver.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Flight {

    @Id
    private int flightNumber;
    private String flightName;
    private String origin;
    private String destination;
    private int seatsAvailable;
    private double fare;
}
