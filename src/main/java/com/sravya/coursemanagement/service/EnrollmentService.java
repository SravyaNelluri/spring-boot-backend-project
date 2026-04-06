package com.sravya.coursemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sravya.coursemanagement.entity.Enrollment;
import com.sravya.coursemanagement.repository.EnrollmentRepository;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollStudent(Enrollment enrollment) { return enrollmentRepository.save(enrollment); }
    public List<Enrollment> getEnrollmentsByStudent(Long studentId) { return enrollmentRepository.findByStudentId(studentId); }
    public List<Enrollment> getEnrollmentsByCourse(Long courseId) { return enrollmentRepository.findByCourseId(courseId); }
}
