package com.sravya.coursemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sravya.coursemanagement.entity.Enrollment;
import com.sravya.coursemanagement.service.EnrollmentService;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public Enrollment enrollStudent(@RequestBody Enrollment enrollment) { return enrollmentService.enrollStudent(enrollment); }

    @GetMapping("/student/{studentId}")
    public List<Enrollment> getByStudent(@PathVariable Long studentId) { return enrollmentService.getEnrollmentsByStudent(studentId); }

    @GetMapping("/course/{courseId}")
    public List<Enrollment> getByCourse(@PathVariable Long courseId) { return enrollmentService.getEnrollmentsByCourse(courseId); }
}
