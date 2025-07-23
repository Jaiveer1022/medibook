package com.dac.cdac.medibook.entity;

import com.dac.cdac.medibook.enums.Specializations;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int specializationId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Specializations specializedIn;

    private String description;

}
