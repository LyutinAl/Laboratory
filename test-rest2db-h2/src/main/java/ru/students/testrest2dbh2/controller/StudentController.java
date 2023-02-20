package ru.students.testrest2dbh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.students.testrest2dbh2.entity.Student;
import ru.students.testrest2dbh2.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @GetMapping(value = "/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping(value = "/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping(value = "/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudent(id);
    }    
}
