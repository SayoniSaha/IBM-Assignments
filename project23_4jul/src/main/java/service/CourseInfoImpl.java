package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import factory.MyConnectionFactory;
import model.Course;

public class CourseInfoImpl implements CourseInfo{
	private MyConnectionFactory cf = null;
	private List<Course> courses;
	private Connection conn = null;
	
	{
		try {
			courses=new ArrayList<Course>();
			cf = MyConnectionFactory.getMyFactory();
			conn = cf.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Course findCourseByName(String course_name) throws SQLException {
		PreparedStatement pstmt = null;
		pstmt = conn.prepareStatement("Select * from course where course_name=?");
		pstmt.setString(1, course_name);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		if(courses.isEmpty())	{
			return null;
		}
		else {
			return courses.get(0);
		}	
	}
	
	@Override
	public Course findCourseById(int id) throws SQLException {
		PreparedStatement pstmt = null;
		pstmt = conn.prepareStatement("Select * from course where id=?");
		pstmt.setInt(1, id);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		if(courses.isEmpty())	{
			return null;
		}
		else {
			return courses.get(0);
		}	
	}

	@Override
	public Course updateCourse(int id, String new_course, String new_instr) throws SQLException {
		PreparedStatement pstmt = null;
	    pstmt = conn.prepareStatement("Update course SET course_name=?, instructor_name=? WHERE id=?");
	    pstmt.setString(1, new_course);
	    pstmt.setString(2, new_instr);
	    pstmt.setInt(3, id);
	    
	    int res = pstmt.executeUpdate();
	    
	    if (res > 0) {
	        pstmt = conn.prepareStatement("Select * from course where course_name=?");
	        pstmt.setString(1, new_course);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            return new Course(rs.getInt(1), rs.getString(2), rs.getString(3));
	        }
	    }
	    
	    return null;
	}

	@Override
	public Course deleteCourse(int id) throws SQLException {
		PreparedStatement pstmt = null;
	    pstmt = conn.prepareStatement("Delete from course where id=?");
	    pstmt.setInt(1, id);
	    
	    int res = pstmt.executeUpdate();
	    
	    if (res > 0) {
	        pstmt = conn.prepareStatement("Select * from course where id=?");
	        pstmt.setInt(1, id);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	            return new Course(rs.getInt(1), rs.getString(2), rs.getString(3));
	        }
	    }
		return null;
	}

	@Override
	public Course createCourse(Course course) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("Insert into course(id,course_name,instructor_name) values(?,?,?)");
		pstmt.setInt(1, course.getId());
		pstmt.setString(2, course.getCourse_name());
		pstmt.setString(3, course.getCourse_instructor());
		int res = pstmt.executeUpdate();
		System.out.println(res + " row(s) inserted");

		return course;
	}

	@Override
	public List<Course> getAllCourses()  throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("Select * from course");
		while(resultSet.next()) {
			courses.add(new Course(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
		}
		return courses;
	}
}
