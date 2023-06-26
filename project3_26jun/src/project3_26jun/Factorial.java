package project3_26jun;
import java.util.*;

public class Factorial {
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		  int i,fact=1;  
		  int num = sc.nextInt();    
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println(fact);    
	}  

}
