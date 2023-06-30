package model;

import java.util.*;

public class NameComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFirstname().compareTo(s2.getFirstname());
			}
}
