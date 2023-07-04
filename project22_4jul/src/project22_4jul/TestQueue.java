package project22_4jul;

public class TestQueue implements Runnable {
    private MyQueue myQueue;

    public TestQueue(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        myQueue.enqueue('a');
        myQueue.enqueue('b');
        myQueue.enqueue('c');
        myQueue.enqueue('d');
        myQueue.enqueue('e');
        myQueue.enqueue('f');
        myQueue.enqueue('g');
        myQueue.enqueue('h');
        myQueue.enqueue('i');
        myQueue.enqueue('j');

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
