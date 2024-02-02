package com.proj.studmarks.service.impl;

import com.proj.studmarks.entity.Student;
import com.proj.studmarks.repository.StudentRepository;
import com.proj.studmarks.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student studentEntry) {
        return studentRepository.save(studentEntry);
    }

    @Override
    public Student updateStudent(Student studentEntry) {
        return studentRepository.save(studentEntry);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
