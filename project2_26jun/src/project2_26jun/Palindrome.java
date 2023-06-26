package project2_26jun;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int a,sum=0,temp;    
		  int n=sc.nextInt(); 
		  
		  temp=n;    
		  while(n>0){  
			  a=n%10;  
			  sum=(sum*10)+a;    
			  n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Palindrome");    
		  else    
		   System.out.println("Not Palindrome");    
		}  
		}
	}

}
