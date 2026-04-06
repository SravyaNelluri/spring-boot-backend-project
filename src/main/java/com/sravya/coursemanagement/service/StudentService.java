package com.sravya.coursemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sravya.coursemanagement.entity.Student;
import com.sravya.coursemanagement.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) { return studentRepository.save(student); }
    public List<Student> getAllStudents() { return studentRepository.findAll(); }
}
