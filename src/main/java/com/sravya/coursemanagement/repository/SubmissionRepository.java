package com.sravya.coursemanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sravya.coursemanagement.entity.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
    List<Submission> findByStudentId(Long studentId);
    List<Submission> findByAssignmentId(Long assignmentId);
}
