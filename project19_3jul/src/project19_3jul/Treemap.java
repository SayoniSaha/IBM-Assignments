package project19_3jul;

import java.util.*;

public class Treemap {
	public static void main(String args[]){  
		  TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
//		  1
		  tmap.put(1, "Black");
		  tmap.put(2, "Blue");
		  tmap.put(3, "Purple");
		  tmap.put(4, "Red");
		  tmap.put(5, "White");
		    
		  for (Map.Entry<Integer,String> entry : tmap.entrySet()) {
			  System.out.println(entry.getKey() + "=>" + entry.getValue());
		  }
//		  3
		  if(tmap.containsKey("c1")){
	           System.out.println("Contains key c1");
	      } else {
	           System.out.println("Does not contain key C1");
	      }
//		  4
		  if(tmap.containsValue("Blue")){
	           System.out.println("Contains: Yes");
	      } else {
	           System.out.println("Contains: No");
	      }
//		  5
		  Set<Integer> keys = tmap.keySet();
	      for(Integer key: keys){
	           System.out.println(key);
	      }
//	      8
	      System.out.println("Greatest key: " + tmap.firstEntry());
	      System.out.println("Least key: " + tmap.lastEntry());
//	      9
	      System.out.println("First key: " + tmap.firstKey());
	      System.out.println("Last key: " + tmap.lastKey());
//	      10
	      System.out.println("Reverse order view of the keys: " + tmap.descendingKeySet());
//	      6
	      tmap.clear();
	      System.out.println("Cleared map: "+tmap);

	} 
}

// 7
class sort implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
}
