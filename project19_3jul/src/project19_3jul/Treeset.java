package project19_3jul;

import java.util.*;

public class Treeset {
	public static void main(String[] args) {
		  TreeSet<String> ts = new TreeSet<String>();
		  ts.add("Black");
		  ts.add("Blue");
		  ts.add("Purple");
		  ts.add("Red");
		  ts.add("Orange");
//		  1
		  System.out.println(ts);
//		  2
		  for (String e : ts) {
			    System.out.println("Element: " + e);
		  }
//		  3
		  TreeSet<String> ts2 = new TreeSet<String>();
		  ts2.add("White");
		  ts2.add("Green");
		  System.out.println("Tree set 2: "+ts2);
		  ts.addAll(ts2);
		  System.out.println("Tree set: "+ ts);
//		  4
		  Iterator<String> it = ts.descendingIterator();
		  System.out.println("Reverse Order:");
		  while (it.hasNext()) {
			  System.out.println(it.next());
		  }
//		  5
		  System.out.println("First Element: "+ts.first());
		  System.out.println("Last Element: "+ts.last());
//		  6
		  TreeSet<String> ts1 = (TreeSet<String>)ts.clone();
		  System.out.println("Cloned tree set: " + ts1);
//		  7
		  System.out.println("Size of tree set: " + ts.size());
//		  8
          TreeSet<String> ts3 = new TreeSet<String>();
		  ts3.add("Yellow");
          ts3.add("Blue");
          ts3.add("Black");
          ts3.add("Orange");
          System.out.println("Second Tree set: "+ts3);
          for (String e : ts){
             System.out.println(ts3.contains(e) ? "Yes" : "No");
          }
//        9
          TreeSet <Integer>ts4 = new TreeSet<Integer>();
          TreeSet <Integer>x = new TreeSet<Integer>();
            
          ts4.add(1);
          ts4.add(2);
          ts4.add(3);
          ts4.add(5);
          ts4.add(6);
          ts4.add(7);
          ts4.add(8);
          ts4.add(9);
          ts4.add(10);
            
          x = (TreeSet)ts4.headSet(7);  

          Iterator iterator;
          iterator = x.iterator();
            
          System.out.println("Tree set: ");     
          while (iterator.hasNext()){
        	  System.out.println(iterator.next() + " ");
          }
//        10
          System.out.println("Greater than or equal to 0 : "+ts4.ceiling(0));

	}
}
