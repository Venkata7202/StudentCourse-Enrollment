package com.annamacharya.stucourse.service;

import com.annamacharya.stucourse.entity.Enrollment;

import java.util.List;

public interface EnrollmentService {
    List<Enrollment> getAllEnrollments();
    Enrollment getEnrollmentById(Long enrollmentId);
    Enrollment saveEnrollment(Enrollment enrollment);
    void deleteEnrollmentById(Long enrollmentId);
}
