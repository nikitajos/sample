package com.sample.itemize;

public class Grade {
// "MATH101_2016_Fall"
	private String uniqueCourseId;

	public String getUniqueCourseId() {
		return uniqueCourseId;
	}

	public void setUniqueCourseId(String uniqueCourseId) {
		this.uniqueCourseId = uniqueCourseId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	private String grade;
}
