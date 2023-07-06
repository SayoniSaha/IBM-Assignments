package service;

import java.sql.SQLException;
import java.util.*;

import model.Course;

public interface CourseInfo {
	public List<Course> getAllCourses() throws SQLException;
	public Course findCourseByName(String course_name) throws SQLException;
	public Course findCourseById(int id) throws SQLException;
	public Course updateCourse(int id, String string, String string2) throws SQLException;
	public Course deleteCourse(int id) throws SQLException;
	public Course createCourse(Course course) throws SQLException;

}
