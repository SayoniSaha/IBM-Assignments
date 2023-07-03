package project19_3jul;

import java.util.*;

public class Arraylist1 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Black");
		li.add("Blue");
		li.add("Purple");
		li.add("Red");
		li.add("Orange");
		
//	1
		System.out.println(li);
//	2
		for (String e : li) {
		    System.out.println(e);
		}
//  3
		li.add(0, "Yellow");
		System.out.println(li);
//	4
		System.out.println(li.get(1));
//	5
		li.set(4, "White");
		System.out.println(li);
//	6
		li.remove(2);
		System.out.println(li);
//	7
		if (li.contains("Red")) {
		    System.out.println("Found!");
		} else {
		    System.out.println("Not found!");
		}
//	8
		Collections.sort(li);
		System.out.println(li);
//	9
		List<String> li2 = new ArrayList<String>();
		li2.add("Teal");
		li2.add("Cyan");
		System.out.println("li2: " + li2);
		Collections.copy(li, li2);
		System.out.println("List 1: " + li);
		System.out.println("List 2: " + li2);
//	10
		Collections.shuffle(li);
		System.out.println("Shuffled: " + li);
//	11
		Collections.reverse(li);
		System.out.println("Reversing : " + li);
//	12
		List<String> li3 = li.subList(1, 3);
		System.out.println("Sublist: " + li3);
//	13
		ArrayList<String> li4= new ArrayList<String>();
        li4.add("Yellow");
        li4.add("Green");
        li4.add("Teal");
        li4.add("Red");

        ArrayList<String> li5 = new ArrayList<String>();
        for (String e : li)
           li5.add(li4.contains(e) ? "Yes" : "No");
        System.out.println(li5);
 //  14
        Collections.swap(li, 1, 4);
        System.out.println("Swapped array:" + li);
 //  15
        ArrayList<String> li6= new ArrayList<String>();
        li6.add("Blue");
        li6.add("Green");
        li6.add("Black");
        li6.add("Orange");
        System.out.println("Second array: " + li6);
       
        ArrayList<String> li7 = new ArrayList<String>();
        li7.addAll(li);
        li7.addAll(li6);
        System.out.println("Joined array: " + li7);
 //  16
        Object li8 = ((ArrayList<String>) li).clone();
        System.out.println("Cloned array: " + li8);
 //  17
        li7.removeAll(li7);
        System.out.println("Empty array: "+li7);
 //  18
        System.out.println("Empty: "+li7.isEmpty());
 //  19
        ((ArrayList<String>) li).trimToSize();
        System.out.println("Trimmed array: " + li);
 //  20
        ((ArrayList<String>) li).ensureCapacity(6);
        li.add("Blue");
        li.add("Red");
        li.add("Green");
        System.out.println("Array size increased: " + li);

	}
}