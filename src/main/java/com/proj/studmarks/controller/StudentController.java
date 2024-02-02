package com.proj.studmarks.controller;

import com.proj.studmarks.entity.Student;
import com.proj.studmarks.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }
    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student studentEntry){
        return studentService.saveStudent(studentEntry);
    }

    @PutMapping("/update")
    public ResponseEntity updateStudent(@RequestBody Student studentEntry){
        Student updateEmployee = studentService.updateStudent(studentEntry);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
