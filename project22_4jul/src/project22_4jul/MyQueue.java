package project22_4jul;

public class MyQueue {
    private char[] x = new char[6];
    private int head = 0;
    private int tail = 0;

    public synchronized void enqueue(char val) {
        try {
            while ((tail+1) % x.length == head) {
                wait();
            }
            x[tail] = val;
            tail = (tail+1) % x.length;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized char dequeue() {
        try {
            while (head == tail) {
                wait();
            }
            char val = x[head];
            head = (head+1) % x.length;
            notifyAll();
            return val;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return '0';
        }
    }
}
