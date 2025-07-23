package com.dac.cdac.medibook.entity;

import com.dac.cdac.medibook.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int patientIid;

    @Column(nullable = false)
    private  String firstName;

    @Column(nullable = false)
    private  String lastName;

    @Column(nullable = false, unique = true)
    private  String email;

    private  String phone;
    private  Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    @ManyToOne(optional = false)
    @JoinColumn(name = "specialization_id", referencedColumnName = "specializationId")
    private Specialization specializationId;

    @Column(unique = true)
    private String licenseNumber;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
