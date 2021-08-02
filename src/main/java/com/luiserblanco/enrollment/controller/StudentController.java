package com.luiserblanco.enrollment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Student;
import com.luiserblanco.enrollment.data.repository.StudentRepository;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/students")
public class StudentController {	
	
	private final StudentRepository studentRepository;
	private final Counter studentCounter;
	
	public StudentController(StudentRepository studentRepository, MeterRegistry registry) {
		this.studentRepository = studentRepository;
		this.studentCounter = Counter.builder("api.student").register(registry);
	}
	
	@GetMapping
	public Iterable<Student>getStudents() {
		return studentRepository.findAll();		
	}
}
