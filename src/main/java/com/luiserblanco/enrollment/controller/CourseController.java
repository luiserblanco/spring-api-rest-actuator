package com.luiserblanco.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Course;
import com.luiserblanco.enrollment.data.repository.CourseRepository;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired 
	private CourseRepository  courseRepository;
	private final Counter courseCounter;
	
	public CourseController(CourseRepository courseRepository, MeterRegistry registry) {
		this.courseRepository = courseRepository;
		this.courseCounter = Counter.builder("api.course").register(registry);
	}
	
	@GetMapping
	public Iterable<Course> getCourse(){
		return courseRepository.findAll();
	}
	

}
