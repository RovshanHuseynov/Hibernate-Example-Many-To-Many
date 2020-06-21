package com.rh.spring.hibernateexamplemanytomany.controller;

import com.rh.spring.hibernateexamplemanytomany.entity.Student;
import com.rh.spring.hibernateexamplemanytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentRepository studentRepository;

    public StudentController(@Autowired StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        System.out.println("/student");
        return studentRepository.findAll();
    }
}
