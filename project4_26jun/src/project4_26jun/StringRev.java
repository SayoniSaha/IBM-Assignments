package project4_26jun;
import java.util.*;

public class StringRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();    
        String revStr = "";    
            
        for(int i = str.length()-1; i >= 0; i--){    
            revStr = revStr + str.charAt(i);    
        }    
            
        System.out.println(revStr);    
    }    

}
