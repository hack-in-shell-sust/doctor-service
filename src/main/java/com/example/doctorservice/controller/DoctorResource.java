package com.example.doctorservice.controller;

import com.example.doctorservice.common.utils.IPUtils;
import com.example.doctorservice.data.entity.Doctor;
import com.example.doctorservice.domain.dto.DoctorInfoRequest;
import com.example.doctorservice.domain.dto.NearestDoctorRequest;
import com.example.doctorservice.domain.model.DoctorBasicInfo;
import com.example.doctorservice.service.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( IPUtils.defaultUrl)
public class DoctorResource {
    private final DoctorService doctorService;

    @GetMapping("/list")
    public List<DoctorBasicInfo> getAllDoctorsList() {
        List<DoctorBasicInfo> doctorBasicInfoList = doctorService.getDoctorsBasicInfoList();
        return doctorBasicInfoList;
    }

    @PostMapping("/info")
    public Doctor getDoctorInfo(@RequestBody DoctorInfoRequest request) {
        Doctor doctor = doctorService.getDoctorById(request.getId());
        return doctor;
    }

    @PostMapping("/nearby")
    public List<Doctor> getNearbyDoctors(@RequestBody NearestDoctorRequest request) {
        List<Doctor> doctors = doctorService.getNearbyDoctors(request);
        return doctors;
    }

    @PostMapping("/nearest")
    public Doctor getNearestDoctor(@RequestBody NearestDoctorRequest request) {
        Doctor doctor = doctorService.getNearestDoctor(request);
        return doctor;
    }

    @PostMapping("/nearest/center")
    public List<Object[]> getNearestDoctorsWithDiagnosticCenters(@RequestBody NearestDoctorRequest request) {
        List<Object[]> doctors = doctorService.getNearestDoctorsWithDiagnosticCenters(request);
        return doctors;
    }
}
