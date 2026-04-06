package com.sravya.coursemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sravya.coursemanagement.entity.Course;
import com.sravya.coursemanagement.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course addCourse(@RequestBody Course course) { return courseService.addCourse(course); }

    @GetMapping
    public List<Course> getAllCourses() { return courseService.getAllCourses(); }
}
