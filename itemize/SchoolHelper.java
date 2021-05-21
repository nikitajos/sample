package com.sample.itemize;

import java.util.List;

public class SchoolHelper {

	// i would use injection here rather than new keyword

	private School school;

	public SchoolHelper() {
		// TODO Auto-generated constructor stub
	}

	public List<Teacher> getTeachers() {
		return school.getTeachers();
	}

	public List<Student> getAllStudents() {
		return school.getAllStudents();
	}

	public List<Course> getCourses() {
		return school.getAllCourses();
	}

}
