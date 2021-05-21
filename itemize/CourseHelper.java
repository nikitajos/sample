package com.sample.itemize;

import java.util.List;

public class CourseHelper {
	// i would use injection here rather than new keyword
	private SchoolHelper schoolHelper;

	public Teacher getTeacherFromCourse(Course course) {
		List<Teacher> teachers = schoolHelper.getTeachers();
		for (Teacher teacher : teachers) {
			for (Course courseAssoc : teacher.getCourses()) {
				if (courseAssoc.equals(course)) {
					return teacher;
				}
			}
		}
		//no reasults matched
		return null;
	}

}
