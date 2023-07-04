package project21_3jul;

public class OddEven {
	  private static final int max = 20;
	  private static Object lock = new Object();
	  private static boolean even = true;

	  public static void main(String[] args) {
	    Thread t1 = new Thread(() -> {
	      for (int i = 2; i <= max; i += 2) {
	        synchronized(lock) {
	          while (!even) {
	            try {
	              lock.wait();
	            } catch (InterruptedException e) {
	              e.printStackTrace();
	            }
	          }
	          System.out.println("Even numbers: " + i);
	          even = false;
	          lock.notify();
	        }
	      }
	    });

	    Thread t2 = new Thread(() -> {
	      for (int i = 1; i <= max; i += 2) {
	        synchronized(lock) {
	          while (even) {
	            try {
	              lock.wait();
	            } catch (InterruptedException e) {
	              e.printStackTrace();
	            }
	          }
	          System.out.println("Odd numbers: " + i);
	          even = true;
	          lock.notify();
	        }
	      }
	    });

	    t1.start();
	    t2.start();
	  }
	}
