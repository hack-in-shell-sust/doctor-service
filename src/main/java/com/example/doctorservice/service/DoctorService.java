package com.example.doctorservice.service;

import com.example.doctorservice.data.repository.DoctorRepository;
import com.example.doctorservice.domain.dto.NearestDoctorRequest;
import com.example.doctorservice.domain.model.DoctorBasicInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.doctorservice.data.entity.Doctor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class DoctorService extends BaseService {
    private final DoctorRepository doctorRepository;

    public List<DoctorBasicInfo> getDoctorsBasicInfoList() {
        List<Doctor> doctors = doctorRepository.findAll();

        Stream<DoctorBasicInfo> doctorBasicInfoStream = doctors.stream()
                .map(doctor -> new DoctorBasicInfo(doctor.getName(), doctor.getId()));

        List<DoctorBasicInfo> doctorBasicInfoList = doctorBasicInfoStream
                .collect(Collectors.toList());

        return doctorBasicInfoList;
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Doctor not found"));
    }

    public List<Doctor> getNearbyDoctors(NearestDoctorRequest request) {
        List<Doctor> doctors = doctorRepository.findNearestDoctors
                (request.getLatitude(), request.getLongitude());

        return doctors;
    }

    public Doctor getNearestDoctor(NearestDoctorRequest request) {
        List<Doctor> doctors = doctorRepository.findNearestDoctors
                (request.getLatitude(), request.getLongitude());

        return doctors.get(0);
    }


}
