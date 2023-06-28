package com.model;

public class Counter {
	private static int count;
	public Counter() {
	
		count++;
		
		System.out.println(Counter.count);
		
	}
	public static void main(String args[]){
		Counter counter=new Counter();
		Counter counter1=new Counter();
		Counter counter2=new Counter();
		System.out.println(counter + "\n" + counter1 + "\n" + counter2);
	}
}