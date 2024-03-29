package com.example.doctorservice.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "height")
    private Double height;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

}
