package com.dac.cdac.medibook.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
public class TimeSlots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int slotId;

    @Column(nullable = false , unique = true)
    private LocalTime startTime;

    @Column(nullable = false, unique = true)
    private LocalTime endTime;
}
