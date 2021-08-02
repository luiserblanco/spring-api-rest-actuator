package com.luiserblanco.enrollment.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luiserblanco.enrollment.data.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends CrudRepository<Enrollment, Long> {
	Iterable<Enrollment> findEnrollmentByGrade(String grade);
	Iterable<Enrollment> findEnrollmentByStudentId(long studentId);
}
