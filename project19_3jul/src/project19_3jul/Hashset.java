package project19_3jul;

import java.util.*;

public class Hashset {
	public static void main(String[] args) {
	    HashSet<String> s = new HashSet<String>();
	    s.add("Black");
		s.add("Blue");
		s.add("Purple");
		s.add("Red");
		s.add("Orange");
//		1
		System.out.println(s);
//		2
		Iterator<String> i = s.iterator();
        while (i.hasNext()) {
		   System.out.println("Each element: " + i.next());
		}
//      3
        System.out.println("Size of Hash set: " + s.size());
//      5
        System.out.println("Empty?: "+s.isEmpty());
//      6
        HashSet <String> s2 = new HashSet <String> ();
        s2 = (HashSet)s.clone();
        System.out.println("Cloned Hash set: " + s2);
//      7
        String[] arr = new String[s.size()];
        s.toArray(arr);
   
        System.out.println("Array: ");
        for(String e : arr){
        	System.out.println(e);
        }
//      8
        Set<String> treeset = new TreeSet<String>(s);
        
        System.out.println("TreeSet: ");
        for(String e : treeset){
           System.out.println(e);
        }
//      9
        List<String> li = new ArrayList<String>(s);
        System.out.println("ArrayList contains: "+ li);
//      10
        HashSet<String> s3 = new HashSet<String>();
        s3.add("Red");
        s3.add("Purple");
		s3.add("Red");
		s3.add("Orange");
        for (String element : s){
           System.out.println(s3.contains(element) ? "Yes" : "No");
        }     

	}
}
