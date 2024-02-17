package com.example.doctorservice.data.repository;

import com.example.doctorservice.data.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    @Query(value = "SELECT d.*, dc_dist.distance " +
            "FROM (" +
            "    SELECT dc.id, " +
            "           6371 * " +
            "           acos(cos(radians(:userLatitude)) * cos(radians(dc.latitude)) * " +
            "                cos(radians(dc.longitude) - radians(:userLongitude)) + " +
            "                sin(radians(:userLatitude)) * sin(radians(dc.latitude))) AS distance " +
            "    FROM diagnostic_centers dc " +
            "    ORDER BY distance " +
            "    LIMIT 20" +
            ") dc_dist " +
            "JOIN doctor_diagnostic_centers ddc ON dc_dist.id = ddc.diagnostic_center_id " +
            "JOIN doctor d ON ddc.doctor_id = d.id ORDER BY dc_dist.distance",
            nativeQuery = true)
    List<Doctor> findNearestDoctors(@Param("userLatitude") Double userLatitude, @Param("userLongitude") Double userLongitude);

    @Query(value = "SELECT DISTINCT d.*, dc.id AS center_id, dc.name AS center_name, " +
            "dc.latitude AS center_latitude, dc.longitude AS center_longitude, " +
            "6371 * acos(cos(radians(:userLatitude)) * cos(radians(dc.latitude)) * " +
            "cos(radians(dc.longitude) - radians(:userLongitude)) + " +
            "sin(radians(:userLatitude)) * sin(radians(dc.latitude))) AS center_distance " +
            "FROM doctor_diagnostic_centers ddc " +
            "JOIN doctor d ON ddc.doctor_id = d.id " +
            "JOIN diagnostic_centers dc ON ddc.diagnostic_center_id = dc.id " +
            "ORDER BY d.id, center_distance",
            nativeQuery = true)
    List<Object[]> findUniqueDoctorsWithDiagnosticCenters(@Param("userLatitude") Double userLatitude, @Param("userLongitude") Double userLongitude);


}
