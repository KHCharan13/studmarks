package com.proj.studmarks.service;

import com.proj.studmarks.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllStudents();
    Optional<Student> findById(Long id);
    Student saveStudent(Student studentEntry);
    Student updateStudent(Student studentEntry);
    void deleteStudent(Long id);
}
