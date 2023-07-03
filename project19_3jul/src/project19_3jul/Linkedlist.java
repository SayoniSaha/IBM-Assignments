package project19_3jul;

import java.util.*;

public class Linkedlist {
	public static void main(String[] args) {
	    LinkedList<String> li = new LinkedList<String>();
		li.add("Black");
		li.add("Blue");
		li.add("Purple");
		li.add("Red");
		li.add("Orange");
//		1
		System.out.println("Linked list: " + li);
//		2
		for (String e : li) {
		    System.out.println("Each element: " + e);
		}
//		3
		Iterator<String> i = li.listIterator(2);

        while (i.hasNext()) {
		   System.out.println("From position 2: " + i.next());
		}
//      4
        Iterator<String> r = li.descendingIterator();

        System.out.println("Reverse Order: ");
        while (r.hasNext()) {
           System.out.println(r.next());
        }
//      5
        li.add(3, "Yellow");
		System.out.println("Linked list: " + li);
//		6
		li.addFirst("White");
	    li.addLast("Cyan");
        System.out.println("Elements added: " + li);
//      7
        li.offerFirst("Red");
        System.out.println("Linked list: " + li);
//      8
        li.offerLast("Green");
        System.out.println("Linked list: " + li);
//      9
        LinkedList <String> li2 = new LinkedList <String> ();
        li2.add("Beige");
        li2.add("Violet");

        li.addAll(1, li2);

        System.out.println("Linked list: " + li);
//      10
        Object fe = li.getFirst();
        System.out.println("First element: "+fe);
     
        Object le = li.getLast();
        System.out.println("Last element: "+le);

	}
}
