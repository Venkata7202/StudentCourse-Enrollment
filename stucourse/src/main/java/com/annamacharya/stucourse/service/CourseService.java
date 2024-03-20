package com.annamacharya.stucourse.service;

import com.annamacharya.stucourse.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long courseId);
    Course saveCourse(Course course);
    void deleteCourseById(Long courseId);
}
