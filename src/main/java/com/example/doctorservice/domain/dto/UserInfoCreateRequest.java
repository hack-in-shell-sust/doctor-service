package com.example.doctorservice.domain.dto;

import lombok.Data;

@Data
public class UserInfoCreateRequest {
    private String email;
    private Long userId;
}
