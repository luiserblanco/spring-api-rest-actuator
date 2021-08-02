package com.luiserblanco.enrollment.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luiserblanco.enrollment.data.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	
	Iterable<Course> findCoursesByCourseName(String nameCourse);
}
