package com.luiserblanco.enrollment.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ENROLLMENT")
public class Enrollment {
	
	@Id
    @Column(name="ENROLLMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long enrollmentId;
    @Column(name="COURSE_ID")
    private long courseId;
    @Column(name="STUDENT_ID")
    private long studentId;
    @Column(name="GRADE")
    private String grade;
    
	public long getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
