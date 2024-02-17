package com.example.doctorservice.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class DoctorDegreesId implements Serializable {

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "degree_id")
    private Long degreeId;

}
