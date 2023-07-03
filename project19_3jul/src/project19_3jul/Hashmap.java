package project19_3jul;

import java.util.*;

public class Hashmap {  
	public static void main(String args[]) {
//		1
		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		hmap.put(1, "Black");
		hmap.put(2, "Blue");
		hmap.put(3, "Purple");
		hmap.put(4, "Red");
		hmap.put(5, "Orange");
		for(Map.Entry x:hmap.entrySet()){  
			System.out.println(x.getKey()+" "+x.getValue());  
		}
//		2
		System.out.println("Size of hash map: "+hmap.size());
//		3
		HashMap <Integer,String> hmap2 = new HashMap <Integer,String> ();
		hmap2.put(6, "Green");
		hmap2.put(7, "Yellow");
		System.out.println("Values in second map: " + hmap2);
		hmap2.putAll(hmap);
		System.out.println("Hash map: " + hmap2);
//		4
		hmap2.clear();
		System.out.println("Hash map: " + hmap2);
//		5
		boolean res = hmap.isEmpty();
		System.out.println("Empty?: " + res);
//		6
		HashMap<Integer,String> hmap3= new HashMap<Integer,String>(); 
		hmap3 = (HashMap)hmap.clone();     
		System.out.println("Cloned map: " + hmap3);
//		7
		System.out.println("Blue exists?");
		if (hmap.containsKey("Blue")) {
			System.out.println("Yes: " + hmap.get("Blue"));
		} else {
		   System.out.println("No");
		}
//		8
		System.out.println("Green exists?");
		if (hmap.containsValue("Green")) {
			System.out.println("Yes: " + hmap.get("Green"));
		} else {
		   System.out.println("No");
		}
//		9
		Set set = hmap.entrySet();
		System.out.println("Set values: " + set);
//		10
		String val = (String)hmap.get(2); 
		System.out.println("Value for key 2: " + val);
	}
}
