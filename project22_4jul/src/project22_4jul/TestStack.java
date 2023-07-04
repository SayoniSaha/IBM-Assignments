package project22_4jul;

public class TestStack implements Runnable {

	private MyStack mystack;
	{	mystack = new MyStack();
	}
	
	@Override
	public void run() {
		mystack.push('a');
		mystack.push('b');
		mystack.push('c');
		mystack.push('d');
		mystack.push('e');
		mystack.push('f');
		mystack.push('g');
		mystack.push('h');
		mystack.push('i');
		mystack.push('j');
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	}
}
