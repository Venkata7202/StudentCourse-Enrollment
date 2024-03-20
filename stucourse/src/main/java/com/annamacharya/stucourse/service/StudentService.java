package com.annamacharya.stucourse.service;

import com.annamacharya.stucourse.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long studentId);
    Student saveStudent(Student student);
    void deleteStudentById(Long studentId);
}
