package com.example.doctorservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoctorBasicInfo {
    private String name;
    private Long id;
}
