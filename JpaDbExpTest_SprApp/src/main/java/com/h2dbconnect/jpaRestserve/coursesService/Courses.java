package com.h2dbconnect.jpaRestserve.coursesService;

public class Courses {

	private int courseId;
	private String courseName;
	private String autherName;
	
	public Courses(int courseId, String courseName, String auString) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.autherName = auString;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAutherName() {
		return autherName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", autherName=" + autherName + "]";
	}
	
}