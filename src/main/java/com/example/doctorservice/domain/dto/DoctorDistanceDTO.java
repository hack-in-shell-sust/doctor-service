package com.example.doctorservice.domain.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@SqlResultSetMapping(
    name = "DoctorDistanceMapping",
    classes = @ConstructorResult(
        targetClass = DoctorDistanceDTO.class,
        columns = {
            @ColumnResult(name = "id", type = Long.class),
            @ColumnResult(name = "name", type = String.class),
            @ColumnResult(name = "distance", type = Double.class),
            @ColumnResult(name = "diagnosticCenterId", type = Long.class)
        }
    )
)
public class DoctorDistanceDTO {

    @Id
    private Long id;

    private String name;

    private Double distance;

    private Long diagnosticCenterId;

    // Constructors, getters, and setters
}

