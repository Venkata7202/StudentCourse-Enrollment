package com.annamacharya.stucourse.service.impl;

import com.annamacharya.stucourse.entity.Enrollment;
import com.annamacharya.stucourse.repository.EnrollmentRepository;
import com.annamacharya.stucourse.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getEnrollmentById(Long enrollmentId) {
        return enrollmentRepository.findById(enrollmentId).orElse(null);
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {

        return enrollmentRepository.save(enrollment);
    }

    @Override
    public void deleteEnrollmentById(Long enrollmentId) {
        enrollmentRepository.deleteById(enrollmentId);
    }
}
