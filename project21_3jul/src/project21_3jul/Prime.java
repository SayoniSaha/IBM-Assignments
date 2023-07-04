package project21_3jul;

public class Prime {
  private static final int t = 4;

  public static void main(String[] args) {
    int limit = 10000000;

    Thread[] threads = new Thread[t];
    sumOfPrime[] s = new sumOfPrime[t];

    int segmentSize = limit / t;
    int start = 2;
    int end = segmentSize;

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < t; i++) {
      if (i == t - 1) {
        end = limit;
      }

      s[i] = new sumOfPrime(start, end);
      threads[i] = new Thread(s[i]);
      threads[i].start();

      start = end + 1;
      end += segmentSize;
    }

    long sum = 0;

    for (int i = 0; i < t; i++) {
      try {
        threads[i].join();
        sum += s[i].getSum();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    long endTime = System.currentTimeMillis();

    System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
  }

  static class sumOfPrime implements Runnable {
    private int start;
    private int end;
    private long sum;

    public sumOfPrime(int start, int end) {
      this.start = start;
      this.end = end;
      this.sum = 0;
    }

    public long getSum() {
      return sum;
    }

    private boolean isPrime(int number) {
      if (number < 2) {
        return false;
      }

      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }

      return true;
    }

    @Override
    public void run() {
      for (int i = start; i <= end; i++) {
        if (isPrime(i)) {
          sum += i;
        }
      }
    }
  }
}
