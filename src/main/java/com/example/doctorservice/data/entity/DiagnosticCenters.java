package com.example.doctorservice.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "diagnostic_centers")
public class DiagnosticCenters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double longitude;
    private double latitude;
    private String description;
}
