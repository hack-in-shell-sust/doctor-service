package com.example.doctorservice.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor_degrees")
public class DoctorDegrees {

    @EmbeddedId
    private DoctorDegreesId id;

    @ManyToOne
    @JoinColumn(name = "doctor_id", insertable=false, updatable=false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "degree_id", insertable=false, updatable=false)
    private Degrees degrees;
}
