package project22_4jul;

import java.util.*;

public class StackQueue {
    private Stack<Integer> stack;
    private Queue<Integer> queue;

    public StackQueue() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public synchronized void push(int e) {
        stack.push(e);
    }

    public synchronized int pop() throws InterruptedException {
        while (stack.isEmpty()) {
            wait();
        }
        int e = stack.pop();
        return e;
    }

    public synchronized void enqueue(int element) throws InterruptedException {
        while (!stack.isEmpty()) {
            wait();
        }
        queue.offer(element);
    }

    public synchronized int dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int element = queue.poll();
        return element;
    }
}
