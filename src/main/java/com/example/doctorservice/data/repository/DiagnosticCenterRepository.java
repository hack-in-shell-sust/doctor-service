package com.example.doctorservice.data.repository;

import com.example.doctorservice.data.entity.DiagnosticCenters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenters, Long> {
    @Query(value = "SELECT * " +
            "FROM diagnostic_centers dc " +
            "ORDER BY earth_distance(ll_to_earth(:latitude, :longitude), ll_to_earth(dc.latitude, dc.longitude)) " +
            "LIMIT 20",
            nativeQuery = true)
    List<DiagnosticCenters> findTop20NearestCenters(@Param("latitude") double latitude,
                                                    @Param("longitude") double longitude);
}
