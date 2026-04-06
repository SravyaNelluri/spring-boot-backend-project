package com.sravya.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sravya.coursemanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}
