package tester;

import model.Student;
import model.NameComparator;
import model.GpaComparator;

import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		Comparator<Student> gpaComparator = new GpaComparator();
        Comparator<Student> nameComparator = new NameComparator();

        TreeSet<Student> studentGpa = new TreeSet<>(gpaComparator);
        studentGpa.add(new Student("ab", "cd", 4.0));
        studentGpa.add(new Student("ef", "gh", 3.0));
        System.out.println("GPA compare:" + studentGpa);

        TreeSet<Student> studentName = new TreeSet<>(nameComparator);
        studentName.add(new Student("ab", "cd", 4.0));
        studentName.add(new Student("ef", "gh", 3.0));
        System.out.println("Name compare:" + studentName);
		

	}
}
