package com.sravya.coursemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sravya.coursemanagement.entity.Course;
import com.sravya.coursemanagement.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course) { return courseRepository.save(course); }
    public List<Course> getAllCourses() { return courseRepository.findAll(); }
}
