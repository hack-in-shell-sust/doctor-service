package com.example.doctorservice.domain.dto;

import lombok.Data;

@Data
public class NearestDoctorRequest {
    private Double latitude;
    private Double longitude;
}
