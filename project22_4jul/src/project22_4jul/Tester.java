package project22_4jul;

public class Tester {
	public static void main(String[] args) {
		
//		Stack
//		TestStack s = new TestStack();
//		Thread t1 = new Thread(s);
//		t1.start();
//		Thread t2 = new Thread(s);
//		t2.start();
		
//		Queue
		MyQueue myQueue = new MyQueue();

        Thread t1 = new Thread(new TestQueue(myQueue));
        t1.start();

        Thread t2 = new Thread(new TestQueue(myQueue));
        t2.start();
	}
}
