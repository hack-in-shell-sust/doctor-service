package com.example.doctorservice.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor_diagnostic_centers")
public class DoctorDiagnosticCenters {

    @EmbeddedId
    private DoctorDiagonosticCentersId id;

    @ManyToOne
    @JoinColumn(name = "doctor_id", insertable=false, updatable=false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "diagnostic_center_id", insertable=false, updatable=false)
    private DiagnosticCenters diagnosticCenters;

    @ManyToOne
    @JoinColumn(name = "availability", insertable=false, updatable=false)
    private Availability availability;

}
