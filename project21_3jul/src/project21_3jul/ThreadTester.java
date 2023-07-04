package project21_3jul;

public class ThreadTester {
    public static void main(String[] args) {
        HelloRunner r=new HelloRunner();
        Thread t1=new Thread(r);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2=new Thread(r);
        t2.start();
    }
}
