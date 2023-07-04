package project22_4jul;

public class MyStack {
	private int index = -1;
	private char[] x = new char[6];
	public  void push(char item) {
		synchronized (this) {
			x[++index]=item;
		}
	}
	public synchronized char pop() {
		return x[index--];
	}
}
