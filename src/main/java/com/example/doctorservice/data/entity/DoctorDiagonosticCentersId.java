package com.example.doctorservice.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DoctorDiagonosticCentersId implements Serializable {

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "diagonostic_center_id")
    private Long diagnosticCenterId;
}
