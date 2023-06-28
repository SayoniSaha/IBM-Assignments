package com.model;
import java.util.*;

public class CalculateTax {
    public static double Tax(double sal) {
        double tax = 0.0;
        
        if (sal > 150000) {
            tax += (sal-150000)* 0.3;
            sal = 150000;
        }
        else if (sal > 60000 && sal<=150000) {
            tax += (sal-50000)* 0.2;
            sal = 50000;
        }
        else if (sal > 50000 && sal<=60000) {
            tax += (sal-40000)* 0.1;
        }
        return tax;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        double incomeTax = Tax(sal);
        
        System.out.println(incomeTax);
        sc.close();
    }
}

