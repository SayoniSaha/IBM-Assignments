package com.ibm.project23_4jul;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

import model.Course;
import service.CourseInfo;
import service.CourseInfoImpl;

public class CourseTester {
	public static void main(String[] args) {		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course","root","root");
			Statement stmt = conn.createStatement();
			ResultSet rs2 = stmt.executeQuery("Select * from course");
			while(rs2.next())
			{
				System.out.println(rs2.getInt("id") + "," + rs2.getString("course_name") + "," + rs2.getString("instructor_name"));
			}
			conn.close();
			
			CourseInfo cs = new CourseInfoImpl();
			
//			findbyname
			Course c1 = cs.findCourseByName("Java");
			if(c1 == null) {
				System.out.println("No such course");
			}
			else {
				System.out.println(c1);
			}
			
//			findbyid
			Course c2 = cs.findCourseById(2);
			if(c2 == null) {
				System.out.println("No such course");
			}
			else {
				System.out.println(c2);
			}
			
//			updatebyid
			Course c3 = cs.updateCourse(1,"JS","jh gf");		
			if(c3 == null) {
				System.out.println("No such course");
			}
			else {
				System.out.println("Updated-\n" + c3);
			}
			
//			deletebyid
			Course c4 = cs.deleteCourse(1);
			if(c4 == null) {
				System.out.println("No such course");
			}
			else {
				System.out.println("Deleted");
			}
			
			Course c5 = cs.createCourse(new Course(1, "abc", "fd sa"));
			System.out.println(c5);
			List<Course> l = cs.getAllCourses();
			for(Course x : l) {
				System.out.println(x);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
