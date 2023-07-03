package project20_3jul;

import java.io.*; 

public class Exceptions {
    public static void main(String args[]) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first value: ");
            String str = br.readLine();
            int n1 = Integer.parseInt(str);
            System.out.print("Enter second value: ");
            str = br.readLine();
            int n2 = Integer.parseInt(str);
            System.out.println(n1/n2);
        } 
        catch (NumberFormatException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("Finally");
            try {
                br.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        int a = 10;
        int b = 20;
        System.out.println("Without try/catch");
        System.out.println(a + b);
    }
}