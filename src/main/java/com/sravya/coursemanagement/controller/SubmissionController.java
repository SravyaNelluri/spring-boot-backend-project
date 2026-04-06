package com.sravya.coursemanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sravya.coursemanagement.entity.Submission;
import com.sravya.coursemanagement.service.SubmissionService;

@RestController
@RequestMapping("/submissions")
public class SubmissionController {
    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public Submission submitAssignment(@RequestBody Submission submission) { return submissionService.submitAssignment(submission); }

    @GetMapping("/assignment/{assignmentId}")
    public List<Submission> getByAssignment(@PathVariable Long assignmentId) { return submissionService.getSubmissionsByAssignment(assignmentId); }

    @GetMapping("/student/{studentId}")
    public List<Submission> getByStudent(@PathVariable Long studentId) { return submissionService.getSubmissionsByStudent(studentId); }
}
