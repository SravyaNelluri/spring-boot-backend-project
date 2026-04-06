package com.sravya.coursemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sravya.coursemanagement.entity.Assignment;
import com.sravya.coursemanagement.service.AssignmentService;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public Assignment addAssignment(@RequestBody Assignment assignment) { return assignmentService.addAssignment(assignment); }

    @GetMapping("/course/{courseId}")
    public List<Assignment> getByCourse(@PathVariable Long courseId) { return assignmentService.getAssignmentsByCourse(courseId); }
}
