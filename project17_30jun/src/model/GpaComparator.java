package model;

import java.util.*;

public class GpaComparator implements Comparator<Student> {
		
	@Override
	public int compare(Student s1, Student s2) {
		double d=s1.getGPA() - s2.getGPA();
		if(d == 0) {
			return 0;
		}
		else if(d < 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
