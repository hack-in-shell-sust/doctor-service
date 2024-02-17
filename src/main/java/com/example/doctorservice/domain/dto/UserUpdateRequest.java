package com.example.doctorservice.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserUpdateRequest {
    private String email;
    private String name;
    private Date dateOfBirth;
    private Double weight;
    private Double height;
    private String description;

}
