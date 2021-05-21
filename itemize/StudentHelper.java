package com.sample.itemize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class StudentHelper {

	private Map<String, Integer> gradeMap = new HashMap<>();
	// inject
	private SchoolHelper schoolHelper;

	public StudentHelper() {
		gradeMap.put("A", 4);
		gradeMap.put("B", 3);
		gradeMap.put("C", 2);
		gradeMap.put("F", 0);
	}

	public String getGrade(String studentId, Course course) {
		StringJoiner queryCourse = new StringJoiner("_");
		queryCourse.add(course.getId());
		queryCourse.add(String.valueOf(course.getYear()));
		queryCourse.add(course.getSemester());
		List<Student> allStudents = schoolHelper.getAllStudents();
		for (Student currStudent : allStudents) {
			if (studentId.equals(currStudent.getId())) {
				for (Grade currGrade : currStudent.getGrades()) {
					if (queryCourse.toString().equalsIgnoreCase(currGrade.getUniqueCourseId())) {
						return currGrade.getGrade();
					}
				}
			}
		}
		// not found
		return null;
	}

	public int getGradePointAverage(String studentId, String year, String semester) {
		List<Student> allStudents = schoolHelper.getAllStudents();

		int sum = 0;
		int courseCount = 0;
		for (Student currStudent : allStudents) {
			if (studentId.equals(currStudent.getId())) {
				for (Grade currGrade : currStudent.getGrades()) {
					String uniqueCourseId = currGrade.getUniqueCourseId();
					if (uniqueCourseId.indexOf(year) > 0 && uniqueCourseId.indexOf(semester) > 0) {
						courseCount++;
						sum = sum + gradeMap.get(currGrade.getGrade());
					}

				}
			}
		}

		if (courseCount > 0) {
			return sum / courseCount;
		}
		// not found
		return -1;
	}

	public List<List<String>> getAllGrades() {
		return null;
	}

}
