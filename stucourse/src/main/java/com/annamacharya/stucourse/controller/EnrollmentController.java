package com.annamacharya.stucourse.controller;

import com.annamacharya.stucourse.entity.Enrollment;
import com.annamacharya.stucourse.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;
    @GetMapping
    public ResponseEntity<List<Enrollment>> getAllEnrollments() {
        List<Enrollment> enrollments = enrollmentService.getAllEnrollments();
        return new ResponseEntity<>(enrollments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enrollment> getEnrollmentById(@PathVariable("id") Long enrollmentId) {
        Enrollment enrollment = enrollmentService.getEnrollmentById(enrollmentId);
        if (enrollment == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(enrollment, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Enrollment> saveEnrollment(@RequestBody Enrollment enrollment) {
        Enrollment savedEnrollment = enrollmentService.saveEnrollment(enrollment);
        return new ResponseEntity<>(savedEnrollment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnrollmentById(@PathVariable("id") Long enrollmentId) {
        enrollmentService.deleteEnrollmentById(enrollmentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
