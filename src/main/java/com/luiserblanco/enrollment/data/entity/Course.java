package com.luiserblanco.enrollment.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {

	@Id
	@Column(name="COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	@Column(name="NAME")
	private String courseName;
	@Column(name="HOURS")
	private String courseHours;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseHours() {
		return courseHours;
	}
	public void setCourseHours(String courseHours) {
		this.courseHours = courseHours;
	}
}
