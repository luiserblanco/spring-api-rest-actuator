package com.luiserblanco.enrollment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiserblanco.enrollment.data.entity.Enrollment;
import com.luiserblanco.enrollment.data.repository.EnrollmentRepository;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

	private final EnrollmentRepository enrollmentRepository;
	private final Counter enrollmentCounter;
	
	public EnrollmentController(EnrollmentRepository enrollmentRepository, MeterRegistry registry) {
		this.enrollmentRepository = enrollmentRepository;
		this.enrollmentCounter = Counter.builder("api.enrollment").register(registry);
	}
	
	@RequestMapping
	public Iterable<Enrollment> getEnrollment(){		
		return enrollmentRepository.findAll();
	}
}
