package com.example.doctorservice.data.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "degrees")
public class Degrees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String degreeName;
}
