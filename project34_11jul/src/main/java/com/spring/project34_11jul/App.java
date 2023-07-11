package com.spring.project34_11jul;

import java.util.*;

import model.Employee;
import model.Department;
import model.Location;

import model.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
       try {
    	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	   Employee e = context.getBean("employee",Employee.class);
    	   Department d = context.getBean("department",Department.class);
    	   Location l = context.getBean("location",Location.class);
    	   
    	   l.setLocationId(12);
    	   l.setLocationName("Kolkata");
    	   l.setCounty("India");
    	   
    	   d.setDepartmentId(23);
    	   d.setDepartmentName("Sales");
    	   d.setLocation(l);
    	   
    	   e.setEmployeeId(new Random().nextInt(10000));
    	   e.setEmloyeeName("Ab Cd");
    	   e.setSalary(10000);
    	   e.setDepartment(d);
    	   System.out.println(e);
    	   
// --------------
    	   Student s = context.getBean("s",Student.class);
    	   System.out.println(s);
    	   Student student1=context.getBean("s",Student.class);
    	   System.out.println(student1);
    	   Student student2=context.getBean("s",Student.class);
    	   System.out.println(student2);
    	   
    	   System.out.println(s == student1 && s == student2);
    	   
		} catch (Exception e) {
			   e.printStackTrace();
		}
    }
}
