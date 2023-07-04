package project21_3jul;

public class MatrixMultiply {
	  private static final int mLength = 3;
	  private static final int t = 2;

	  public static void main(String[] args) {
	    int[][] m1 = {
	      {
	        1,
	        2,
	        3
	      },
	      {
	        4,
	        5,
	        6
	      },
	      {
	        7,
	        8,
	        9
	      }
	    };

	    int[][] m2 = {
	      {
	        9,
	        8,
	        7
	      },
	      {
	        6,
	        5,
	        4
	      },
	      {
	        3,
	        2,
	        1
	      }
	    };

	    int[][] result = new int[mLength][mLength];

	    Thread[] threads = new Thread[t];
	    int segmentSize = mLength / t;

	    for (int i = 0; i < t; i++) {
	      int startIndex = i * segmentSize;
	      int endIndex = (i == t - 1) ? mLength - 1 : (startIndex + segmentSize - 1);
	      threads[i] = new Thread(new MultiplicationTask(m1, m2, result, startIndex, endIndex));
	      threads[i].start();
	    }

	    for (Thread thread: threads) {
	      try {
	        thread.join();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }

	    // Print the result matrix
	    System.out.println("Result:");
	    for (int[] row: result) {
	      for (int element: row) {
	        System.out.print(element + " ");
	      }
	      System.out.println();
	    }
	  }

	  static class MultiplicationTask implements Runnable {
	    private int[][] m1;
	    private int[][] m2;
	    private int[][] result;
	    private int startIndex;
	    private int endIndex;

	    public MultiplicationTask(int[][] m1, int[][] m2, int[][] result, int startIndex, int endIndex) {
	      this.m1 = m1;
	      this.m2 = m2;
	      this.result = result;
	      this.startIndex = startIndex;
	      this.endIndex = endIndex;
	    }

	    @Override
	    public void run() {
	      int cols = m2[0].length;

	      for (int i = startIndex; i <= endIndex; i++) {
	        for (int j = 0; j < cols; j++) {
	          for (int k = 0; k < mLength; k++) {
	            result[i][j] += m1[i][k] * m2[k][j];
	          }
	        }
	      }
	    }
	  }
}
