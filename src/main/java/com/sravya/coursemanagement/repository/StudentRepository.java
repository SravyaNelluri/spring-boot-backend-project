package com.sravya.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sravya.coursemanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
