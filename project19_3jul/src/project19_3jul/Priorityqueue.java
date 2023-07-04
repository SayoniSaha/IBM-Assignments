package project19_3jul;

import java.util.*;

public class Priorityqueue {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();  
		pq.add("Black");
		pq.add("Blue");
		pq.add("Purple");
		pq.add("Red");
		pq.add("Orange");
//		1
		System.out.println(pq);
//		2
		for (String e : pq) {
		    System.out.println("Element: " + e);
		}
//		3
		PriorityQueue<String> pq2 = new PriorityQueue<String>();  
		pq2.add("Yellow");
		pq2.add("Green");
		System.out.println("Second priority queue: " + pq);
		pq2.addAll(pq);
		System.out.println("After adding: " + pq);
//		4
		pq.offer("Teal");
	    System.out.println("After inserting new element: " + pq);
//	    5
	    pq2.clear();
	    System.out.println("Cleared: " + pq2);
//	    6
	    System.out.println("Total elements: " + pq.size());
//	    7
	    pq2.add("Red");
        pq2.add("Gray");
        pq2.add("Silver");
        pq2.add("Orange");
        System.out.println("Second priority queue: " + pq2);
        for (String e : pq){
           System.out.println(pq2.contains(e) ? "Yes" : "No");
        }
//      8
        System.out.println("The first element of Queue: "+pq.peek());
//      9
        System.out.println("Removing first element: " + pq.poll());
        System.out.println("After removing element: "+pq);
//      10
        List<String> array_list = new ArrayList<String>(pq);
        System.out.println("Converting priority queue to array: " + array_list);

	}
}
