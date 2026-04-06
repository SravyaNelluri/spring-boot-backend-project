package com.sravya.coursemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sravya.coursemanagement.entity.Assignment;
import com.sravya.coursemanagement.repository.AssignmentRepository;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public Assignment addAssignment(Assignment assignment) { return assignmentRepository.save(assignment); }
    public List<Assignment> getAssignmentsByCourse(Long courseId) { return assignmentRepository.findByCourseId(courseId); }
}
