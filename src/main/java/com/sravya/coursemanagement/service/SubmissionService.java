package com.sravya.coursemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sravya.coursemanagement.entity.Submission;
import com.sravya.coursemanagement.repository.SubmissionRepository;

@Service
public class SubmissionService {
    @Autowired
    private SubmissionRepository submissionRepository;

    public Submission submitAssignment(Submission submission) { return submissionRepository.save(submission); }
    public List<Submission> getSubmissionsByAssignment(Long assignmentId) { return submissionRepository.findByAssignmentId(assignmentId); }
    public List<Submission> getSubmissionsByStudent(Long studentId) { return submissionRepository.findByStudentId(studentId); }
}
